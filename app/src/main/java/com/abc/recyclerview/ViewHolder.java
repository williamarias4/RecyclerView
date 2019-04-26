package com.abc.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

//encargado de registrar el enlace al card item
public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    //hacer esto como tercera parte.
    private List<Source> sourceList;

    //hacer esto como primera parte.
    private Button button1;
    private Button button2;
    private ImageView image;
    private TextView title;

    public ViewHolder(@NonNull View itemView, List<Source> sourceList) {
        super(itemView);
        //hacer esto como primera parte.
        button1 = itemView.findViewById(R.id.button1);
        button2 = itemView.findViewById(R.id.button2);
        image =  itemView.findViewById(R.id.image);
        title = itemView.findViewById(R.id.title);

        //hacer esto como segunda parte.
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

        //hacer esto como tercera parte
        this.sourceList = sourceList;
    }

    public Button getButton1() {
        return button1;
    }

    public Button getButton2() {
        return button2;
    }

    public ImageView getImage() {
        return image;
    }

    public TextView getTitle() {
        return title;
    }

    @Override
    public void onClick(View v) {
        //tercera parte
        int position = getAdapterPosition();
        Source source = sourceList.get(position);

        //segunda parte
        if(v.getId() == button1.getId()) {
          Toast.makeText(button1.getContext(),
                  "Click on option one, item " + position + " for title " + source.getTitle()
                  , Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(button2.getContext(),
                    "Click on option two, item " + position + " for title " + source.getTitle()
                    , Toast.LENGTH_SHORT).show();
        }
    }
}
