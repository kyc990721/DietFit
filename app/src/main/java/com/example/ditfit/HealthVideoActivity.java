package com.example.ditfit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class HealthVideoActivity extends Activity {
    TextView exerciseName,Ex_explain,Warning_tx;
    YouTubePlayerView youTubePlayer;
    Button Popup_button;
    String NameofExercise = "";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_video);
        exerciseName = (TextView) findViewById(R.id.exerciseName);
        Ex_explain = (TextView) findViewById(R.id.explain);
        Warning_tx = (TextView) findViewById(R.id.warningText);
        youTubePlayer = (YouTubePlayerView)findViewById(R.id.youtube_player_view);
        Popup_button = (Button)findViewById(R.id.popup);



        /* 전체화면 나중에 할것 https://onlyfor-me-blog.tistory.com/526
        youTubePlayer.addFullScreenListener(new YouTubePlayerFullScreenListener() {
            @Override
            public void onYouTubePlayerEnterFullScreen() {
                youTubePlayer.enterFullScreen();
            }

            @Override
            public void onYouTubePlayerExitFullScreen() {
                youTubePlayer.exitFullScreen();
            }
        });*/



        Intent intent = getIntent();
        Intent popupintent = new Intent(getApplicationContext(),HealthAddActivity.class);

        Popup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupintent.putExtra("ExerciseName",intent.getStringExtra("ExerciseName"));
                startActivity(popupintent);
            }
        });

        switch (intent.getStringExtra("ExerciseName")){
            //어깨
            case "스탠딩 밀리터리 프레스":
                exerciseName.setText("스탠딩 밀리터리 프레스");
                Ex_explain.setText("스탠딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");
                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "EkQvh2xLLL4";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });

                break;
            case "시티드 밀리터리 프레스":
                exerciseName.setText("시티드 밀리터리 프레스");
                Ex_explain.setText("시티드 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");
                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "ic1Ixe-g1xs";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });

                break;
            case "푸쉬 프레스":
                exerciseName.setText("푸쉬 프레스");
                Ex_explain.setText("3333푸쉬 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");
                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "ep30avTSMB0";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "원 암 리니어 재머":
                exerciseName.setText("원 암 리니어 재머");
                Ex_explain.setText("3333푸쉬 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");
                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "De2G39d8S6E";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "클린 앤 프레스":
                exerciseName.setText("클린 앤 프레스");
                Ex_explain.setText("3333푸쉬 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");
                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "9lSjbxkjCqU";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "클린 앤 저크":
                exerciseName.setText("클린 앤 저크");
                Ex_explain.setText("3333푸쉬 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");
                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "9HyWjAk7fhY";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "브래드포드 프레스":
                exerciseName.setText("브래드포드 프레스");
                Ex_explain.setText("3333푸쉬 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");
                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "gD6XoIXGmDI";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "바벨 후사면 로우":
                exerciseName.setText("바벨 후사면 로우");
                Ex_explain.setText("3333푸쉬 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");
                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "gvBbvB9NKrk";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "전면 레이즈":
                exerciseName.setText("전면 레이즈");
                Ex_explain.setText("3333푸쉬 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");
                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "ALNyDCkW9y8";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "측면 레이즈":
                exerciseName.setText("측면 레이즈");
                Ex_explain.setText("3333푸쉬 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");
                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "FeJP4E4Z-PY";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "시티드 덤벨 프레스":
                exerciseName.setText("시티드 덤벨 프레스");
                Ex_explain.setText("3333푸쉬 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");
                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "lfb3ffbrd4Q";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "스탠딩 덤벨 프레스":
                exerciseName.setText("스탠딩 덤벨 프레스");
                Ex_explain.setText("3333푸쉬 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");
                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "kkEueFMQphU";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "아놀드 프레스":
                exerciseName.setText("아놀드 프레스");
                Ex_explain.setText("3333푸쉬 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");
                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "6Z15_WdXmVw";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "덤벨 인클라인 어깨 레이즈":
                exerciseName.setText("덤벨 인클라인 어깨 레이즈");
                Ex_explain.setText("3333푸쉬 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");
                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "qHorCK6nESQ";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "인클라인 측면 레이즈":
                exerciseName.setText("인클라인 측면 레이즈");
                Ex_explain.setText("3333푸쉬 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");
                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "6I6AlMABLL8";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;

            //가슴
            case "디클라인 푸쉬업":
                exerciseName.setText("디클라인 푸쉬업");
                Ex_explain.setText("디클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "epfxnk8jBsc";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "플랫 푸쉬업":
                exerciseName.setText("플랫 푸쉬업");
                Ex_explain.setText("디클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "IODxDxX7oi4";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "인클라인 푸쉬업":
                exerciseName.setText("인클라인 푸쉬업");
                Ex_explain.setText("디클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "Z0bRiVhnO8Q";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "중량 푸쉬업":
                exerciseName.setText("중량 푸쉬업");
                Ex_explain.setText("디클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "sUZVwnUEpRI";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "플로어 덤벨 프레스":
                exerciseName.setText("플로어 덤벨 프레스");
                Ex_explain.setText("디클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "uUGDRwge4F8";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "디클라인 벤치프레스":
                exerciseName.setText("디클라인 벤치프레스");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "0uvDycOIej0";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "플랫 벤치프레스":
                exerciseName.setText("플랫 벤치프레스");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "vthMCtgVtFw";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "인클라인 벤치프레스":
                exerciseName.setText("인클라인 벤치프레스");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "SrqOu55lrYU";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "디클라인 덤벨프레스":
                exerciseName.setText("디클라인 덤벨프레스");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "Vp5STzNfMxI";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "플랫 덤벨프레스":
                exerciseName.setText("플랫 덤벨프레스");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "xphvjGDZeYE";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "인클라인 덤벨프레스":
                exerciseName.setText("인클라인 덤벨프레스");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "0G2_XV7slIg";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "로우 케이블 플라이":
                exerciseName.setText("로우 케이블 플라이");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "M1N804yWA-8";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "미들 케이블플라이":
                exerciseName.setText("미들 케이블플라이");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "1SoJVttMI1w";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "풀오버":
                exerciseName.setText("풀오버");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "Q8l6ykgnmPM";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "딥스":
                exerciseName.setText("딥스");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "yN6Q1UI_xkE";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;

            //팔
            case "바벨컬":
                exerciseName.setText("바벨컬");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "i1YgFZB6alI";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "해머컬":
                exerciseName.setText("해머컬");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "7jqi2qWAUJk";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "덤벨컬":
                exerciseName.setText("덤벨컬");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "pOs4tMPAIwQ";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "오버헤드 케이블 컬":
                exerciseName.setText("오버헤드 케이블 컬");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "9xEPQwUDNuI";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "컨센트레이션 컬":
                exerciseName.setText("컨센트레이션 컬");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "FtvCg-1yYXw";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "리버스 컬":
                exerciseName.setText("리버스 컬");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "MgGMYbvKkHg";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "드래그컬":
                exerciseName.setText("드래그컬");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "BjBmtkfy1-0";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "라잉 케이블 컬":
                exerciseName.setText("라잉 케이블 컬");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "OEP-Sd4et5A";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "스탠딩 트라이셉 로프 익스텐션":
                exerciseName.setText("스탠딩 트라이셉 로프 익스텐션");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "Lq7HlN59pfc";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "클로즈그립 벤치 프레":
                exerciseName.setText("클로즈그립 벤치 프레");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "Nv43VSWWGtc";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "벤치딥스":
                exerciseName.setText("벤치딥스");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "jdFzYGmvDyg";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;

            case "오버헤드 트라이셉 익스텐션":
                exerciseName.setText("오버헤드 트라이셉 익스텐션");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "38QQai2Ag9Y";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "라잉 트라이셉 익스텐션":
                exerciseName.setText("라잉 트라이셉 익스텐션");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "D-0iFILcRnw";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "킥백":
                exerciseName.setText("킥백");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "jxYMhEjrQsM";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;

            //등
            case "풀업":
                exerciseName.setText("풀업");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "955scNcjrXs";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "친업":
                exerciseName.setText("친업");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "VLu9Hu4TTY8";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "랫풀다운":
                exerciseName.setText("랫풀다운");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "6pwUP1loO7U";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "바벨로우":
                exerciseName.setText("바벨로우");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "T3N-TO4reLQ";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "원암로우":
                exerciseName.setText("원암로우");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "EEFHHOCfHgw";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "투암로우":
                exerciseName.setText("투암로우");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "LktGPg-AkvY";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "시티드로우":
                exerciseName.setText("시티드로우");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "MSxvJMWuR6s";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;

            case "티바로우":
                exerciseName.setText("티바로우");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "OrrKhAcb62o";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "펜들레이 로우":
                exerciseName.setText("펜들레이 로우");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "h4nkoayPFWw";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "인버티드로우":
                exerciseName.setText("인버티드로우");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "V04tZ2imlJQ";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "데드리프트":
                exerciseName.setText("데드리프트");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "hCDzSR6bW10";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "하이퍼익스텐션":
                exerciseName.setText("하이퍼익스텐션");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "bOJu7xi3l3Q";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;

            //다리
            case "레그프레스":
                exerciseName.setText("레그프레스");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "FY_6F3csWvc";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "스쿼트":
                exerciseName.setText("스쿼트");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "thQ46oNt7nY";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "프론트스쿼트":
                exerciseName.setText("프론트스쿼트");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "v-mQm_droHg";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "런지":
                exerciseName.setText("런지");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "Q59ZvPhpySM";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "피스톨 스쿼트":
                exerciseName.setText("피스톨 스쿼트");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "PZlLHZ4Venw";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "스티프 레그 데드리프트":
                exerciseName.setText("스티프 레그 데드리프트");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "TJwlBS1jo0Y";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "프론 레그컬":
                exerciseName.setText("프론 레그컬");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "q1cKTmaeQWo";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "시티드 레그컬":
                exerciseName.setText("시티드 레그컬");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "fK0uZ3KRZRI";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "굿모닝":
                exerciseName.setText("굿모닝");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "vKPGe8zb2S4";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "스미스 머신 카프레이즈":
                exerciseName.setText("스미스 머신 카프레이즈");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "avO_qtvHJAg";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "시티드 카프레이즈":
                exerciseName.setText("시티드 카프레이즈");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "xz7sqxaJ-Ck";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "레그프레스 카프프레스":
                exerciseName.setText("레그프레스 카프프레스");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "M4FojyRAcuE";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "바벨 브릿지":
                exerciseName.setText("바벨 브릿지");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "ylpfCk3i-0Y";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "바벨 힙 스러스트":
                exerciseName.setText("바벨 힙 스러스트");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "S_uZP4UH6J0";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "싱글 레그 브릿지":
                exerciseName.setText("싱글 레그 브릿지");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "yFNjwkUNIao";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;

            //복근

            case "플랭크":
                exerciseName.setText("플랭크");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "Zq8nRY9P_cM";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "AB 슬라이드":
                exerciseName.setText("AB 슬라이드");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "-iBq17im3Io";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;

            case "푸쉬업":
                exerciseName.setText("푸쉬업");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "fh4y5dGZX9c";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;

            case "윗몸일으키기":
                exerciseName.setText("윗몸일으키기");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "tfwbpv6gCbg";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "슈퍼맨":
                exerciseName.setText("슈퍼맨");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "4Ydfn_QI3Jw";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "L자앉기":
                exerciseName.setText("L자앉기");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "HuG6SEStAZQ";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;
            case "드래곤 플래그":
                exerciseName.setText("드래곤 플래그");
                Ex_explain.setText("다ㅣ클라임딩 프레스에 대한 설명");
                Warning_tx.setText("주의사항 설명");

                youTubePlayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "vdJMItbm0WQ";
                        youTubePlayer.cueVideo(videoId,0);
                    }
                });
                break;

        }





    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
