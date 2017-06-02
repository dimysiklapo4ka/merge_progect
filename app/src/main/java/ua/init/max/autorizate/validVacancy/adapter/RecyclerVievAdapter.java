package ua.init.max.autorizate.validVacancy.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ua.init.max.autorizate.R;
import ua.init.max.autorizate.validVacancy.models.ModelsVacancy;

import java.util.ArrayList;

/**
 * Created by d1mys1klapo4ka on 01.06.2017.
 */

public class RecyclerVievAdapter extends RecyclerView.Adapter<RecyclerVievAdapter.ViewHolderForVacancy> {

    private ArrayList<ModelsVacancy> modelsVacancyList;
    private Context context;

    public RecyclerVievAdapter(Context context, ArrayList<ModelsVacancy> modelsVacancyList){

        this.context = context;
        this.modelsVacancyList = modelsVacancyList;
    }

    @Override
    public ViewHolderForVacancy onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card,parent,false);

        return new ViewHolderForVacancy(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderForVacancy holder, int position) {

        ModelsVacancy modelsVacancy = modelsVacancyList.get(position);

        holder.tvName.setText(modelsVacancy.getName());
        holder.tvSalary.setText(modelsVacancy.getSalary());
        holder.tvCategory.setText(modelsVacancy.getCategory());
        holder.tvSpecialist.setText(modelsVacancy.getSpecialtist());
    }

    @Override
    public int getItemCount() {
        return modelsVacancyList.size();
    }


    public class ViewHolderForVacancy extends RecyclerView.ViewHolder{

        TextView tvName, tvSalary, tvCategory, tvSpecialist;

        public ViewHolderForVacancy(View itemView) {
            super(itemView);

            tvName = (TextView)itemView.findViewById(R.id.tv_name);
            tvSalary = (TextView)itemView.findViewById(R.id.tv_salary);
            tvCategory = (TextView)itemView.findViewById(R.id.tv_category);
            tvSpecialist = (TextView)itemView.findViewById(R.id.tv_specialistes);
        }
    }
}
