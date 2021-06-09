package sg.edu.rp.c346.id20022543.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvExamTips;
//    String[] examTipsArray;
    ArrayList<String> examTipsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);
//        examTipsArray = new String[5];
//        examTipsArray[0] = "Don't just read the code, code it as much as possible during each practical session";
//        examTipsArray[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
//        examTipsArray[2] = "Prepare your template source code for each topic";
//        examTipsArray[3] = "Create a few empty Android projects to speed up your coding during the exam";
//        examTipsArray[4] = "Ensure that your Android Studio is up and running before the exam";

        examTipsArrayList = new ArrayList<>();
        examTipsArrayList.add("Don't just read the code, code it as much as possible during each practical session");
        examTipsArrayList.add("Seek help from the lecturer ASAP, don't wait till you lost in the jungle");
        examTipsArrayList.add("Prepare your template source code for each topic");
        examTipsArrayList.add("Create a few empty Android projects to speed up your coding during the exam");
        examTipsArrayList.add("Ensure that your Android Studio is up and running before the exam");


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,examTipsArrayList); //array adapter takes in data and and connects to data
        lvExamTips.setAdapter(adapter); //UI connects to adapter
    }
}