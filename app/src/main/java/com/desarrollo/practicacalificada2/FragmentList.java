package com.desarrollo.practicacalificada2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;

import com.desarrollo.practicacalificada2.Models.Contact;

import java.util.List;

public class FragmentList extends Fragment {

    private List<Contact> items;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        items = Contact.getItems();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ContactAdapter contactAdapter = new ContactAdapter(getActivity(), items);
        ListView lv_items = view.findViewById(R.id.lv_items);
        lv_items.setAdapter(contactAdapter);
        lv_items.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listener.onContactItemSelected(position);
            }
        });
    }

    private OnItemSelectedListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof OnItemSelectedListener) {
            this.listener = (OnItemSelectedListener) context;
        }else{
            throw new ClassCastException(context.toString() + " must implement FragmentList.OnItemSelectedListener");
        }
    }

    // Definir los eventos que el fragmento usará para comunicar
    public interface OnItemSelectedListener {
        // Esto puede ser cualquier cantidad de eventos para ser enviados a la actividad
        void onContactItemSelected(int position);
    }
}
