package cn.edu.gdmec.s07150751.activitymenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private  TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1= (TextView) findViewById(R.id.TextView);
        registerForContextMenu(tv1);
    }

    public boolean onCreateOptionsMenu(Menu menu){
           menu.add(0,1,0,R.string.m1);
        menu.add(0,2,0,R.string.m2);
        menu.add(0,3,0,R.string.m3);
      //  MenuInflater mi = getMenuInflater();
     //   mi.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle().toString(),Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle().toString(),Toast.LENGTH_LONG).show();
        return super.onContextItemSelected(item);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.add(0,1,0,R.string.m1);
        menu.add(0,2,0,R.string.m2);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
}
