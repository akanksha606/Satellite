package android.example.satellite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder>{

    private Context mCtx;
    private List<Project> projectList;

    public ProjectAdapter(Context mCtx, List<Project> projectList) {
        this.mCtx = mCtx;
        this.projectList = projectList;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mCtx);
        View view=inflater.inflate(R.layout.project_list,null);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        Project project=projectList.get(position);
        holder.projectName.setText(project.getProjectName());
        holder.ideatorName.setText(project.getIdeatorName());
        holder.time.setText(project.getTime());

    }

    @Override
    public int getItemCount() {
        return projectList.size();
    }

    class ProjectViewHolder extends RecyclerView.ViewHolder{
        TextView projectName,ideatorName,time;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            projectName=itemView.findViewById(R.id.project_name);
            ideatorName=itemView.findViewById(R.id.ideator_name);
            time=itemView.findViewById(R.id.time);

        }
    }
}
