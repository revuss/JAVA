/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalcl;

import java.util.Date;

public class Clock extends Thread {

    Digitalcl dc;
    String time;

    public Clock(Digitalcl dc)
    {
        this.dc = dc;
        start();

    }
    
    public void run()
    {
        while(true)
        {
            time = ""+new Date();
            dc .label1.setText(time);
        }
    }

}
