package test.RadioGroup;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioGroupTest extends Activity {
    /** Called when the activity is first created. */
	//对控件对象进行声明
	private RadioGroup  genderGroup = null;
	private RadioButton male = null;
	private RadioButton female = null;
	
	private RadioGroup levelGroup = null;
	private RadioButton RadioP1 = null;
	private RadioButton RadioP2 = null;
	
	private CheckBox CheckRunning = null;
	private CheckBox CheckSwimming = null;
	private CheckBox CheckSoccer = null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //通过对象的id来得到代表控件的对象
        genderGroup = (RadioGroup) findViewById(R.id.genderGroup);
        male = (RadioButton)findViewById(R.id.RadioMale);
        female = (RadioButton)findViewById(R.id.RadioFemale);
        
        levelGroup = (RadioGroup)findViewById(R.id.LevelGroup);    
        RadioP1 = (RadioButton)findViewById(R.id.RadioP1);
        RadioP2 = (RadioButton)findViewById(R.id.RadioP2);
        
        CheckRunning = (CheckBox)findViewById(R.id.CheckRunning);
        CheckSwimming = (CheckBox)findViewById(R.id.CheckSwimming);
        CheckSoccer = (CheckBox)findViewById(R.id.CheckSoccer);
        //注意此处监听器和button的监听器有所不同
        genderGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if (male.getId() == checkedId){
					System.out.println("male is checked");
					Toast.makeText(RadioGroupTest.this, "male is checked", Toast.LENGTH_SHORT).show();
				}
				else if (female.getId() == checkedId){
					System.out.println("female is checked");
					Toast.makeText(RadioGroupTest.this, "female is checked", Toast.LENGTH_SHORT).show();
				}
					
			}
		});
        
        levelGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if (RadioP1.getId() == checkedId)
					Toast.makeText(RadioGroupTest.this, R.string.p1, Toast.LENGTH_SHORT).show();
				else if (RadioP2.getId() == checkedId)
					Toast.makeText(RadioGroupTest.this, R.string.p2, Toast.LENGTH_SHORT).show();
			}
		});
        
        CheckSwimming.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked)
					System.out.println("Swimming is Checked");
				else
					System.out.println("Swimming is Unchecked");
			}
		});
        
        CheckRunning.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked)
					System.out.println("Running is Checked");
				else 
					System.out.println("Running is Unchecked");
			}
		});
        
        CheckSoccer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked)
					System.out.println("Soccer is Checked");
				else 
					System.out.println("Soccer is Unchecked");
			}
		});
    }
}