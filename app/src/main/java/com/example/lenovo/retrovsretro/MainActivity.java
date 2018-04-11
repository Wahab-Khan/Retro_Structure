package com.example.lenovo.retrovsretro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lenovo.retrovsretro.models.GitHubModel;
import com.example.lenovo.retrovsretro.retro.WebClient;
import com.example.lenovo.retrovsretro.retro.WebServiceFactory;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.git_list);


        WebServiceFactory.webResponce().getRepoFromUser("Wahab-Khan").enqueue(new Callback<List<GitHubModel>>() {
            @Override
            public void onResponse(Call<List<GitHubModel>> call, Response<List<GitHubModel>> response) {

                if(response.isSuccessful() && response!=null) {
                    List<GitHubModel> resp = new ArrayList<>();
                    resp.addAll(response.body());
                    List<String> names = new ArrayList<>();
                    for (GitHubModel n:resp){
                        names.add(n.getName());
                    }

                    ListAdapter adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, names);

                    listView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<List<GitHubModel>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "this shit is not working", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
