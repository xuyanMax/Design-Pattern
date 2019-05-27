package state.alarm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by xu on 03/02/2018.
 */
public class SafeFrame extends Frame implements Context, ActionListener{
    private State state = DayState.getInstance();//默认初始state

    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("使用金库");
    private Button buttonAlarm = new Button("按下警铃");
    private Button buttonPhone = new Button("正常通话");
    private Button buttonExit = new Button("结束");

    //按下按钮后，该方法被调用
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse)
            state.doUse(this);
        else if (e.getSource() == buttonPhone)
            state.doPhone(this);
        else if (e.getSource() == buttonAlarm)
            state.doAlarm(this);
        else if (e.getSource() == buttonExit)
            System.exit(0);
        else
            System.out.println("??");
    }

    public SafeFrame(String title) {
        super(title);

        setBackground(Color.lightGray);
        setLayout(new BorderLayout());

        // user cannot edit the text
        textClock.setEditable(false);
        textScreen.setEditable(false);

        add(textClock, BorderLayout.NORTH);
        add(textScreen, BorderLayout.CENTER);
        //添加按钮
        Panel panel = new Panel();
        panel.add(buttonAlarm);
        panel.add(buttonUse);
        panel.add(buttonExit);
        panel.add(buttonUse);
        add(panel, BorderLayout.SOUTH);
        //显示
        pack();
        show();

        //设置监听器
        buttonUse.addActionListener(this);//this表示实现了ActionListener接口的类
        buttonAlarm.addActionListener(this);
        buttonExit.addActionListener(this);
        buttonPhone.addActionListener(this);
    }

    @Override
    public void changeState(State state) {
        System.out.println("状态改变"+this.state+"->"+state);
        this.state = state;
    }

    @Override
    public void setClock(int hour) {
        String t = "current time: ";
        if (hour<10)
            t += "0"+hour+":00";
        else
            t += hour + ":00";
        System.out.println(t);
        textClock.setText(t);
        //context state 更改
        state.doClock(this, hour);//this表示实现了Context接口的类
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! "+msg+"\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record..."+msg+"\n");
    }
}
