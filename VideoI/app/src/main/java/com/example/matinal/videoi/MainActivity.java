package com.example.matinal.videoi;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button botonPlay, botonPause;
    Spinner spinner;
    TextView mediaUri;
    SurfaceView surfaceView;
    SimpleCursorAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonPlay = findViewById(R.id.botonPlay);
        botonPause = findViewById(R.id.botonPause);
        spinner = findViewById(R.id.spinner);
        mediaUri = findViewById(R.id.mediaUri);
        surfaceView = findViewById(R.id.surfaceView);

        final Uri mediaSrc = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        Cursor cursor = managedQuery(mediaSrc,null,null,null,MediaStore.Audio.Media.TITLE);

        String[] titulo = {MediaStore.MediaColumns.TITLE};
        int[] ids = {android.R.id.text1};


        adaptador = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1, cursor, titulo, ids);

        spinner.setAdapter(adaptador);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { });



    }

    public Renderizado(Context contexto) {

        public void onItemSelected(AdapterView<?> padre, View vista, int posicion, long id) {
            titulo.setText(pelicula.toString());
        }

        public void onNothingSelected(AdapterView<?> adapterView) { }

        Cursor cursor = adaptador.getCursor();
        cursor.moveToPosition(posicion);

        String indice = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media._ID));

        pelicula = Uri.withAppendedPath(mediaSrc, indice);

        cuadrado1 = new Cuadrado(color1);
    }
}
