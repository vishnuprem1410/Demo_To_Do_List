package sg.edu.rp.c346.id18015059.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> todoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewToDo);
        todoList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2020, 8, 1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2020, 8,2);


        ToDoItem item1 = new ToDoItem("Go for Movie", date1);
        ToDoItem item2 = new ToDoItem("Go for haircut", date2);

        todoList.add(item1);
        todoList.add(item2);


        CustomAdapter adapter;
       adapter = new CustomAdapter(this, android.R.layout.simple_list_item_1, todoList);
        lvToDo.setAdapter(adapter);
    }
}
