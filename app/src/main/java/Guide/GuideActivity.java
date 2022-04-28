package Guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.rcjoshi.mlkittext.R;

import java.util.ArrayList;

public class GuideActivity extends AppCompatActivity  {

  RecyclerView recyclerView;
  ArrayList<Manual> manuaList;
  MyAdapter myAdapter;
  String[] newHeading;
  String[] brif;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.guide_activity);
    recyclerView=findViewById(R.id.recyclerView);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setHasFixedSize(true);
    manuaList=new ArrayList<Manual>();

    newHeading=new String[]{
            "Мна жерде прилож калай жумыс итейд соны жаз",
            "Утир койып косан тагы раздел косылады  ",

    };
    brif=new String[]{
            //R.string.guide_content осын ctr+мышканын сол жагын басан string file ашылад соган конетн жаз корче
            getString(R.string.guide_content),
            getString(R.string.guide_content)

    };
    myAdapter = new MyAdapter(this, manuaList);
    recyclerView.setAdapter(myAdapter);
    myAdapter.notifyDataSetChanged();
  }


}