package calorieconting.com.pattern.chonlakant.ph.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;



import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import calorieconting.com.pattern.chonlakant.ph.R;
import calorieconting.com.pattern.chonlakant.ph.adapter.ArticlesRecyclerAdapter;
import calorieconting.com.pattern.chonlakant.ph.api.APIService;
import calorieconting.com.pattern.chonlakant.ph.model.modelList;
import calorieconting.com.pattern.chonlakant.ph.service.ApiClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListMenuActivity extends AppCompatActivity {
    @Bind(R.id.cardList_main)
    RecyclerView recyclerView;



    String id;

    String title;
    String code;
    String id_titld;

    ArrayList<modelList> list = new ArrayList<>();

    ArticlesRecyclerAdapter newsArrAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);


        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(llm);

        code = getIntent().getStringExtra("code");
        id_titld = getIntent().getStringExtra("title");
        getNewsArrList(code);

    }

    public void getNewsArrList(String cat) {
        APIService service = ApiClient.getClient().create(APIService.class);

        Call<modelList> userCall = service.getOrder(cat);

        userCall.enqueue(new Callback<modelList>() {
            @Override
            public void onResponse(Call<modelList> call, Response<modelList> response) {
                for (int i = 0; i < response.body().getUser().size(); i++) {

                    list.add(response.body());


                    newsArrAdapter = new ArticlesRecyclerAdapter(getApplicationContext(), list);
                    recyclerView.setAdapter(newsArrAdapter);

                    newsArrAdapter.SetOnItemVideiosClickListener(new ArticlesRecyclerAdapter.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            String title = list.get(position).getUser().get(position).getName();
//                            Intent i = new Intent(getApplicationContext(),WebTabActivity.class);
//                            i.putExtra("url",title);
//                            startActivity(i);


                        }
                    });
                }
            }

            @Override
            public void onFailure(Call<modelList> call, Throwable t) {

            }
        });
    }



}
