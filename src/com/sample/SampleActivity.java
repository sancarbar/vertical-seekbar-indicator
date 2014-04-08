package com.sample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.VerticalSeekBar;

public class SampleActivity extends Activity {
   
	 private VerticalSeekBar verticalSeekBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.main);
        verticalSeekBar=(VerticalSeekBar)findViewById(R.id.vertical_Seekbar);
        verticalSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("Developer", "onStopTrackingTouch: "+seekBar.getProgress());
				
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d("Developer", "onStartTrackingTouch: "+seekBar.getProgress());
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {

                Log.d("Developer", "onProgressChanged: "+seekBar.getProgress());
            }
		});
        

    }
}