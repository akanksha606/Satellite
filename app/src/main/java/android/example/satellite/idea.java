package android.example.satellite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class idea extends AppCompatActivity {
    RecyclerView recyclerView;
    ProjectAdapter adapter;
    List<Project> projectList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idea);
        projectList=new ArrayList<>();

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        projectList.add(new Project(
              "Satellite_project_1",
                "Name 1","Updated 15 minutes ago"
        ));
        projectList.add(new Project(
                "Satellite_project_2",
                "Name 2","Updated 20 minutes ago"
        ));
        projectList.add(new Project(
                "Satellite_project_3",
                "Name 3","Updated 22 minutes ago"
        ));
        projectList.add(new Project(
                "Satellite_project_4",
                "Name 4","Updated 35 minutes ago"
        ));
        projectList.add(new Project(
                "Satellite_project_1",
                "Name 1","Updated 15 minutes ago"
        ));
        projectList.add(new Project(
                "Satellite_project_2",
                "Name 2","Updated 20 minutes ago"
        ));
        projectList.add(new Project(
                "Satellite_project_3",
                "Name 3","Updated 22 minutes ago"
        ));
        projectList.add(new Project(
                "Satellite_project_4",
                "Name 4","Updated 35 minutes ago"
        ));
        adapter=new ProjectAdapter(this,projectList);
        recyclerView.setAdapter(adapter);
    }
}
