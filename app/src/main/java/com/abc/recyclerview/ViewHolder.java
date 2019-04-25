package com.abc.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

//encargado de registrar el enlace al card item
public class ViewHolder extends RecyclerView.ViewHolder {

    private Button button1;
    private Button button2;
    private ImageView image;
    private TextView title;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        button1 = itemView.findViewById(R.id.button1);
        button2 = itemView.findViewById(R.id.button2);
        image =  itemView.findViewById(R.id.image);
        title = itemView.findViewById(R.id.title);
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
}
