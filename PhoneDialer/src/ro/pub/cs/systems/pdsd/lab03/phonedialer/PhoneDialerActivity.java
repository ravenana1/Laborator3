package ro.pub.cs.systems.pdsd.lab03.phonedialer;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class PhoneDialerActivity extends Activity {

	Button button0;
	Button button1;
	Button button2;
	Button button3;
	Button button4 ;
	Button button5;
	Button button6;
	Button button7;
	Button button8;
	Button button9 ;
	Button button10 ;
	Button button11 ;
	ImageButton buttonApel;
	ImageButton buttonCancel ;
	ImageButton buttonBack ;
	EditText phoneNo ;
	
	private ViewClickListener viewClickListener = new ViewClickListener();
	
	private class ViewClickListener implements View.OnClickListener {

		@Override
		public void onClick(View v) {
			String phone = phoneNo.getText().toString();
			
			if(v.getClass() == Button.class){
				if(button0.equals((Button)v)){
					if(phoneNo.getText() != null){
						phoneNo.setText(phoneNo.getText().toString() + "1");
					}
					else{
						phoneNo.setText("1");
					}
					
				}
				else if(button1.equals((Button)v)){
					if(phoneNo.getText() != null){
						phoneNo.setText(phoneNo.getText().toString() + "2");
					}
					else{
						phoneNo.setText("2");
					}
				}
				else if(button2.equals((Button)v)){
					if(phoneNo.getText() != null){
						phoneNo.setText(phoneNo.getText().toString() + "3");
					}
					else{
						phoneNo.setText("3");
					}
				}
				else if(button3.equals((Button)v)){
					if(phoneNo.getText() != null){
						phoneNo.setText(phoneNo.getText().toString() + "4");
					}
					else{
						phoneNo.setText("4");
					}
				}
				else if(button4.equals((Button)v)){
					if(phoneNo.getText() != null){
						phoneNo.setText(phoneNo.getText().toString() + "5");
					}
					else{
						phoneNo.setText("5");
					}
				}
				else if(button5.equals((Button)v)){
					if(phoneNo.getText() != null){
						phoneNo.setText(phoneNo.getText().toString() + "6");
					}
					else{
						phoneNo.setText("6");
					}
				}
				else if(button6.equals((Button)v)){
					if(phoneNo.getText() != null){
						phoneNo.setText(phoneNo.getText().toString() + "7");
					}
					else{
						phoneNo.setText("7");
					}
				}
				else if(button7.equals((Button)v)){
					if(phoneNo.getText() != null){
						phoneNo.setText(phoneNo.getText().toString() + "8");
					}
					else{
						phoneNo.setText("8");
					}
				}
				else if(button8.equals((Button)v)){
					if(phoneNo.getText() != null){
						phoneNo.setText(phoneNo.getText().toString() + "9");
					}
					else{
						phoneNo.setText("9");
					}
				}
				else if(button9.equals((Button)v)){
					if(phoneNo.getText() != null){
						phoneNo.setText(phoneNo.getText().toString() + "*");
					}
					else{
						phoneNo.setText("*");
					}
				}
				else if(button10.equals((Button)v)){
					if(phoneNo.getText() != null){
						phoneNo.setText(phoneNo.getText().toString() + "0");
					}
					else{
						phoneNo.setText("0");
					}
				}
				else if(button11.equals((Button)v)){
					if(phoneNo.getText() != null){
						phoneNo.setText(phoneNo.getText().toString() + "+");
					}
					else{
						phoneNo.setText("+");
					}
				}
			}
			else if(v.getClass() == ImageButton.class){
			
				if(buttonApel.equals((ImageButton)v)){
					Intent intent = new Intent(Intent.ACTION_CALL);
					intent.setData(Uri.parse("tel:" + phoneNo.getText().toString()));
					startActivity(intent);
				}
				else if(buttonCancel.equals((ImageButton)v)){
					finish();
				}
				else if(buttonBack.equals((ImageButton)v)){
					if(phone != null){
						phone = phone.substring(0, phone.length() - 1);
						phoneNo.setText(phone);
					}
				}
				
			}
		}
	}
    
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
       // setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
        button0 = (Button) findViewById(R.id.buton0);
    	button1 = (Button) findViewById(R.id.buton1);
    	button2 = (Button) findViewById(R.id.buton2);
    	 button3 = (Button) findViewById(R.id.buton3);
    	 button4 = (Button) findViewById(R.id.buton4);
    	 button5 = (Button) findViewById(R.id.buton5);
    	 button6 = (Button) findViewById(R.id.buton6);
    	 button7 = (Button) findViewById(R.id.buton7);
    	 button8 = (Button) findViewById(R.id.buton8);
    	 button9 = (Button) findViewById(R.id.buton9);
    	 button10 = (Button) findViewById(R.id.buton10);
    	 button11 = (Button) findViewById(R.id.buton11);
    	 buttonApel = (ImageButton) findViewById(R.id.img_accept);
    	 buttonCancel = (ImageButton) findViewById(R.id.img_hangup);
    	 buttonBack = (ImageButton) findViewById(R.id.img_backspace);
    	 phoneNo = (EditText) findViewById(R.id.phone_number);
        
        
        button0.setText("1");
        button1.setText("2");
        button2.setText("3");
        button3.setText("4");
        button4.setText("5");
        button5.setText("6");
        button6.setText("7");
        button7.setText("8");
        button8.setText("9");
        button9.setText("*");
        button10.setText("0");
        button11.setText("+");
        
        
        button0.setOnClickListener(viewClickListener);
        button1.setOnClickListener(viewClickListener);
        button2.setOnClickListener(viewClickListener);
        button3.setOnClickListener(viewClickListener);
        button4.setOnClickListener(viewClickListener);
        button5.setOnClickListener(viewClickListener);
        button6.setOnClickListener(viewClickListener);
        button7.setOnClickListener(viewClickListener);
        button8.setOnClickListener(viewClickListener);
        button9.setOnClickListener(viewClickListener);
        button10.setOnClickListener(viewClickListener);
        button11.setOnClickListener(viewClickListener);
        buttonApel.setOnClickListener(viewClickListener);
        buttonBack.setOnClickListener(viewClickListener);
        buttonCancel.setOnClickListener(viewClickListener);
           
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.phone_dialer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
