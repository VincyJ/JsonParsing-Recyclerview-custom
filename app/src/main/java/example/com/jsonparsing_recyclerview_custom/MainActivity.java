package example.com.jsonparsing_recyclerview_custom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    int[] rank;
    String[] country;
    String[] population;

    ArrayList<ListModel> arrayList = new ArrayList<ListModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        rank = getResources().getIntArray(R.array.rank);
        country = getResources().getStringArray(R.array.country);
        population = getResources().getStringArray(R.array.population);

        for (int i = 0; i < rank.length; i++) {
            ListModel listModel = new ListModel(rank[i], country[i], population[i]);
            arrayList.add(listModel);
        }

        adapter = new CustomAdapter(this, arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
