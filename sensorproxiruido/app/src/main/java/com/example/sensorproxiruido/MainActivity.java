package com.example.sensorproxiruido;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements SensorEventListener {

    LinearLayout layout_interfaz;
    TextView vista_texto;
    SensorManager administrador_sensores;
    Sensor sensor_proximidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout_interfaz = findViewById(R.id.id_layout);
        vista_texto = findViewById(R.id.id_vista_texto);

        administrador_sensores = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor_proximidad =  administrador_sensores.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        administrador_sensores.getDefaultSensor(Integer.parseInt(Sensor.STRING_TYPE_LIGHT));

        administrador_sensores.registerListener(this,
                sensor_proximidad, administrador_sensores.SENSOR_DELAY_NORMAL);

    }
    private void sound(){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.gritos);
        mediaPlayer.start();
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        String texto_sensor = String.valueOf(sensorEvent.values[0]);
        String estado_sensor;

        if(texto_sensor.equals("5.0")){
            estado_sensor = "Nada tapa al sensor";
        }else{
            estado_sensor = "El sensor esta siendo tapado";
        }

        vista_texto.setText("\n" + "Valor del sensor: " +
                texto_sensor + "\n" + "\n" + "Estado: " + estado_sensor);

        float valor_sensor = Float.parseFloat(texto_sensor);

        if(valor_sensor == 0){
            layout_interfaz.setBackgroundColor(Color.RED);
        //    sound();
        }else{
            layout_interfaz.setBackgroundColor(Color.GREEN);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}