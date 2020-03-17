package com.example.a1825104043;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;




public class UC3 extends AppCompatActivity {
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc3);

        button=findViewById(R.id.rt7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(UC3.this,MainActivity.class);
                startActivity(i);
            }
        });

        Timer timer;
        /**
         * 定时器任务
         */
        TimerTask task;
        /**
         * 消息处理器
         */
        final Handler handler;
        /**
         * 图像视图
         */
       final  ImageView ivBomb;
        /**
         * 图像资源标识数组
         */
        final int[] imgIds;
        /**
         * 图像索引
         */
        int imgIndex;
        /**
         * 图像总数
         */
        final int IMG_COUNT = 6;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            // 利用布局资源文件设置用户界面
            setContentView(R.layout.activity_main);

            // 通过资源标识获得控件实例
            ivBomb = findViewById(R.id.imageView1);

            // 初始化图像标识数组
            imgIds = new int[IMG_COUNT];
            for (int i = 0; i < IMG_COUNT; i++) {
                /**
                 * 参数1：资源文件名
                 * 参数2：资源文件类型
                 * 参数3：包名
                 */
                imgIds[i] = getResources().getIdentifier("imageView1"+ (i + 1), "tools", "net.hw.game_special_effect");
            }

            // 创建消息处理器,处理从定时器任务里发送过来的消息
            handler = new Handler() {
                @Override
                public void handleMessage(Message msg) {
                /*
                  消息内容msg.what存放的是当前图像索引
                  通过它从图像标识数组里获取当前图像的资源标识
                  然后通过此资源标识设置图像控件要显示的图像
                 */
                    ivBomb.setImageResource(imgIds[msg.what]);
                }
            };
        }

        /**
         * 开始按钮单击事件处理方法
         *
         * @param view
         */
        public void doStart(View view) {
            // 实例化定时器
            timer = new Timer();

            // 实例化定时器任务
            task = new TimerTask() {
                @Override
                public void run() {
                    // 更新图像索引
                    imgIndex++;
                    imgIndex %= IMG_COUNT;
                    // 将更新后的图像索引作为消息内容发送给主线程
                    handler.sendEmptyMessage(imgIndex);
                }
            };

            // 对定时器任务进行调度
            /**
             * 参数1：定时器任务
             * 参数2：首次执行延迟时间
             * 参数3：定时执行的周期（毫秒）
             */
            timer.schedule(task, 0, 100);
        }

        /**
         * 停止按钮单击事件处理方法
         *
         * @param view
         */
        public void doStop(View view) {
            // 取消定时器任务
            timer.cancel();
        }
    }




    }
}
