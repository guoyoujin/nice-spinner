package com.example.gyj.nicspinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.gyj.nicespinnerlibrary.NiceSpinner;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private NiceSpinner spinner;
    private NiceSpinner reg_spinner2;
    private  List<String> dataset;
    private  List<String> dataset2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataset = new LinkedList<>(Arrays.asList(getString(R.string.china), getString(R.string.america), getString(R.string.england)));
        dataset2 = new LinkedList<>(Arrays.asList(getString(R.string.china), getString(R.string.america), getString(R.string.england)));

        spinner = (NiceSpinner)findViewById(R.id.reg_spinner);
        reg_spinner2= (NiceSpinner)findViewById(R.id.reg_spinner2);
        spinner.attachDataSource(dataset);
        spinner.setOnItemSelectedListener(new SpinnerSelectedListener());
        spinner.setTextInternal(getString(R.string.country));
        reg_spinner2.attachDataSource(dataset2);
        reg_spinner2.setOnItemSelectedListener(new SpinnerSelectedListener2());
        reg_spinner2.setSelectedIndex(0);
    }
    class SpinnerSelectedListener implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
            System.out.println("arg2====="+arg2+"   ===select country:   "+dataset.get(arg2));
            Toast.makeText(MainActivity.this,"you select country:"+dataset.get(arg2),Toast.LENGTH_SHORT).show();
            switch (arg2) {
                case 0://china
                    break;
                case 1://america
                    break;
                case 2://england
                    break;
                default:

            }
        }
        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }
    class SpinnerSelectedListener2 implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
            System.out.println("arg2====="+arg2+"   ===select country:   "+dataset2.get(arg2));
            Toast.makeText(MainActivity.this,"you select country:"+dataset2.get(arg2),Toast.LENGTH_SHORT).show();
            switch (arg2) {
                case 0://china
                    break;
                case 1://america
                    break;
                case 2://england
                    break;
                default:

            }
        }
        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }
}
