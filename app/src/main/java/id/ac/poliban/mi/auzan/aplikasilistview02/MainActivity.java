package id.ac.poliban.mi.auzan.aplikasilistview02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> mahasiswa = new ArrayList<>();
    {
        mahasiswa.add("Eko Asdy Wibowo Saputra");
        mahasiswa.add("Fenia Dwi Maulida");
        mahasiswa.add("Firda Kharisma");
        mahasiswa.add("Hendra Gunawan");
        mahasiswa.add("Hini Amaliah");
        mahasiswa.add("Insan Nor Cahyo");
        mahasiswa.add("Maisarah");
        mahasiswa.add("Maulida Atikasari");
        mahasiswa.add("Mayadiah Atikasari");
        mahasiswa.add("Molida Junida");
        mahasiswa.add("Muhammad Auzan");
        mahasiswa.add("Muhammad Hafiz Anshari");
        mahasiswa.add("Muhammad Rizki Fahmi");
        mahasiswa.add("Nia Karlida Yanti");
        mahasiswa.add("Nur Rizki Aulia");
        mahasiswa.add("Okta Pasaribu");
        mahasiswa.add("Sari Rahma Maulida");
        mahasiswa.add("Wardatul Hisaniah");
        mahasiswa.add("Wenny Lisandra");
        mahasiswa.add("Ahmad Yusfanhafizh");
        mahasiswa.add("Sri Wahyuni");
        mahasiswa.add("Haifa Mai Suci");
        mahasiswa.add("Muhammad Rasyad Sultansyah");
        mahasiswa.add("Hendri Pratama");
        mahasiswa.add("Risma Sari");
        mahasiswa.add("Muhammad Tri Utomo");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null)
            setTitle("Aplikasi List Mahasiswa 5C-MI");
        ListView listView = findViewById(R.id.lvMahasiswa);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.item_rows_mahasiswa,R.id.tv_item_mahasiswa, mahasiswa);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id)->
                Toast.makeText(this, "Selamat datang " + mahasiswa.get(position), Toast.LENGTH_SHORT).show());
    }
}
