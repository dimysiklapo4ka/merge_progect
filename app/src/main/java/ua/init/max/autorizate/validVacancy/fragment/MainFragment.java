package ua.init.max.autorizate.validVacancy.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ua.init.max.autorizate.R;
import ua.init.max.autorizate.validVacancy.adapter.RecyclerVievAdapter;
import ua.init.max.autorizate.validVacancy.models.ModelsVacancy;

import java.util.ArrayList;

/**
 * Created by d1mys1klapo4ka on 01.06.2017.
 */

public class MainFragment extends Fragment {

    RecyclerView rvChat;

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        jamalaChat(view);
        return view;
    }

    private void jamalaChat(View view){

        rvChat = (RecyclerView)view.findViewById(R.id.rv_chat);
        rvChat.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvChat.setHasFixedSize(true);
        rvChat.setAdapter(new RecyclerVievAdapter(getActivity(), modelChat()));
    }

    private ArrayList<ModelsVacancy> modelChat(){

        ArrayList<ModelsVacancy> modelChats = new ArrayList<>();

        modelChats.add(new ModelsVacancy("Директор 1", "2222 EUR", "Категория 1", "Специальность Энергетик"));
        modelChats.add(new ModelsVacancy("Директор 2", "2543 EUR", "Категория 1", "Специальность Бариста"));
        modelChats.add(new ModelsVacancy("Директор 3", "3421 EUR", "Категория 2", "Специальность Сантехник"));
        modelChats.add(new ModelsVacancy("Директор 4", "1456 EUR", "Категория 3", "Специальность Монтажник"));
        modelChats.add(new ModelsVacancy("Директор 5", "6189 EUR", "Категория 3", "Специальность Слесарь"));
        modelChats.add(new ModelsVacancy("Директор 6", "2987 EUR", "Категория 2", "Специальность Муж на час"));
        modelChats.add(new ModelsVacancy("Director1", "2345 EUR", "Category 1", "Actor"));

        return modelChats;

    }
}
