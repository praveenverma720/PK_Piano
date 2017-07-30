package com.praveen.pkpiano;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btna,btnb,btnc,btnd,btne,btnf,btng,btnh,btni,btnj,btnk,btnl,btnm,btnn,btno,btnp;
    int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
    private SoundPool soundpool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button initilazition
        btna = (Button) findViewById(R.id.a);
        btnb = (Button) findViewById(R.id.b);
        btnc = (Button) findViewById(R.id.c);
        btnd = (Button) findViewById(R.id.d);
        btne = (Button) findViewById(R.id.e);
        btnf = (Button) findViewById(R.id.f);
        btng = (Button) findViewById(R.id.g);
        btnh = (Button) findViewById(R.id.h);
        btni = (Button) findViewById(R.id.i);
        btnj = (Button) findViewById(R.id.j);
        btnk = (Button) findViewById(R.id.k);
        btnl = (Button) findViewById(R.id.l);
        btnm = (Button) findViewById(R.id.m);
        btnn = (Button) findViewById(R.id.n);
        btno = (Button) findViewById(R.id.o);
        btnp = (Button) findViewById(R.id.p);


        //Sound file iitilazation
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            soundpool = new SoundPool.Builder().setMaxStreams(5).build();
        }else {
            soundpool=new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }
            a=soundpool.load(this,R.raw.a,1);
      b=soundpool.load(this,R.raw.b,1);
        c=soundpool.load(this,R.raw.c,1);
        d=soundpool.load(this,R.raw.d,1);
        e=soundpool.load(this,R.raw.e,1);
        f=soundpool.load(this,R.raw.f,1);
        g=soundpool.load(this,R.raw.g,1);
        h=soundpool.load(this,R.raw.h,1);
        i=soundpool.load(this,R.raw.i,1);
        j=soundpool.load(this,R.raw.j,1);
        k=soundpool.load(this,R.raw.k,1);
        l=soundpool.load(this,R.raw.l,1);
        m=soundpool.load(this,R.raw.m,1);
        n=soundpool.load(this,R.raw.n,1);
        o=soundpool.load(this,R.raw.o,1);
        p=soundpool.load(this,R.raw.p,1);

             btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(a, 1, 1, 14, 0, 1);
            }
        });
      btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(b, 1, 1, 14, 0, 1);
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(c, 1, 1, 14, 0, 1);
            }
        });
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(d, 1, 1, 14, 0, 1);
            }
        });
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(e, 1, 1, 14, 0, 1);
            }
        });
        btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(f, 1, 1, 14, 0, 1);
            }
        });
        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(g, 1, 1, 14, 0, 1);
            }
        });
        btnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(h, 1, 1, 14, 0, 1);
            }
        });
        btni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(i, 1, 1, 14, 0, 1);
            }
        });
        btnj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(j, 1, 1, 14, 0, 1);
            }
        });
        btnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(k, 1, 1, 14, 0, 1);
            }
        });
        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(l, 1, 1, 14, 0, 1);
            }
        });
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(m, 1, 1, 14, 0, 1);
            }
        });
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(n, 1, 1, 14, 0, 1);
            }
        });
        btno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(o, 1, 1, 14, 0, 1);
            }
        });
        btnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundpool.play(p, 1, 1, 14, 0, 1);
            }
        });

    }
}
