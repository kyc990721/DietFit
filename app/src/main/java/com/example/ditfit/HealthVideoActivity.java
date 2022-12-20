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
                Ex_explain.setText("1. 바벨을 스쿼트랙에 가슴 높이에 오도록 걸쳐놓는다.\n" +
                        "2. 다리를 구부려 바를 어깨 쇄골 상단에 위치시키고, 그립은 어깨너비보다 살짝 넓게 잡는다.\n" +
                        "3. 바를 들고 나온 뒤, 발을 어깨너비만큼 벌려준다.\n" +
                        "4. 숨을 크게 들이 마신 후 배에 힘을 준 채 엉덩이와 몸통을 조인 상태에서 발를 그대로 위로 들어 올린다.\n" +
                        "5. 바벨을 완전히 들어올렸을 때 호흡을 뱉어주고, 바벨을 내려줄 때는 상체를 살짝 뒤로 젖히면서 바벨을 무게중심 상에 오도록 한다.");
                Warning_tx.setText("1. 발바닥이 움직이거나 들려서는 안된다. \n" +
                        "2. 엉덩이를 뒤로 빼서 허리가 과도하게 아치를 만들거나, 허리가 뒤로 굽어지면 안된다.\n" +
                        "3. 바벨을 무게중심 수직선상에 그대로 위로 올려야 한다.");
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
                Ex_explain.setText("1. 벤치의 각도를 설정한다.\n" +
                        "2. 발은 어깨너비만큼 벌려준다.\n" +
                        "3. 오버그립으로 바벨이 턱 쪽에 와있을 때 손목부터 발꿈치의 각도가 바벨과 수직이 되도록 잡아준다.\n" +
                        "4. 바벨을 랙에서 가져오며 턱 쪽까지 내렸다가 머리 위까지 바벨을 올려준다.\n" +
                        "5. 동작을 반복한다.");
                Warning_tx.setText("1. 허리가 아치형 모양이 안되게 한다.\n" +
                        "2.머리는 수평을 유지하고 시선은 꼭 정면으로 둔다.");
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
                Ex_explain.setText("1. 바닥에서부터 바를 전면 삼각근과 쇄골 위로 올린다.\n" +
                        "2. 다리를 엉덩이 너비로 벌린 채 정면 또는 약간 바깥쪽을 향하게 선다.\n" +
                        "3. 바를 어깨넓이로 잡는다.\n" +
                        "4. 등을 곧게 편 채 시선은 정면을 향하도록 한다.\n" +
                        "5. 폭팔적으로 엉덩이, 무릎, 발목을 펴면서 바를 머리 위로 올려준다.");
                Warning_tx.setText("1. 몸과 허리는 항상 곧게 편 상태를 유지한다.\n" +
                        "2. 숨을 멈추고 복부에 힘을 준 상태에서 바벨을 들어올린다.");
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
                Ex_explain.setText("1. 양발을 어깨 넓이보다 더 벌리고 한손으로 케틀벨을 잡는다.\n" +
                        "2. 복근에 힘을 주며 케틀벨을 들어올린다.\n" +
                        "3. 팔꿈치를 감아 곱게 펴주며 머리위로 케틀벨을 들어올린다.");
                Warning_tx.setText("부상위험이 많은 운동이므로 저중량부터 시작을 한다.");
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
                Ex_explain.setText("1. 허리를 곧게 세우고 흉곽을 열어준다.\n" +
                        "2. 코어와 승모근의 힘으로 바벨을 몸쪽으로 당겨준다.\n" +
                        "3. 프론트 스쿼트 자세를 잡아준다.\n" +
                        "4. 몸의 중심이 무너지지 않게 코어를 잡고 발바닥으로 지면을 밀어내면서 일어난다.\n" +
                        "5. 힙을 뒤로 빼며 살짝 앉아준다.\n" +
                        "6. 중심을 잡으며 바를 들어올려준다.\n" +
                        "7. 모든 관절을 다 펴고 2초정도 버텨준다.");
                Warning_tx.setText("1. 코어에 힘을 주어 허리가 굽히지 않도록 해준다.\n" +
                        "2. 손목에 무리가 가는 운동이다.");
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
                Ex_explain.setText("1. 흉곽을 확장 시켜놓고 덤벨을 잡아준다.\n" +
                        "2. 어깨선상 까지 덤벨을 끌어올린다.");
                Warning_tx.setText("1. 부상의 위험도가 높은 동작으로 저중량부터 시작한다.");
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
                Ex_explain.setText("1. 허리를 곧게 펴고 복압에 힘을 준 상태에서 팔꿈치도 곧게 펴고 시선은 정면 턱은 들어준다.\n" +
                        "2. 덤벨을 들어올릴 때 어깨와 팔꿈치가 일직선상으로 올라가야 한다.\n" +
                        "3. 덤벨을 내릴 때 천천히 내려와준다.");
                Warning_tx.setText("1. 어깨높이 이상으로 덤벨을 들어올릴 경우 승모근의 개입이 많아지게 되므로 정해진 범위까지만 올라간다.");
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
                Ex_explain.setText("1. 벤치에 앉아 등과 허리를 곧게 편다.\n" +
                        "2. 손등이 앞을 향하게 하여 덤벨을 얼굴 앞으로 들어올린다.\n" +
                        "3. 손목을 몸 바깥쪽으로 회전시키면서 덤벨을 머리 위로 들어올린다.\n" +
                        "4. 손목을 몸 안쪽으로 회전시키며 덤벨을 다시 원위치로 내린다.");
                Warning_tx.setText("1. 전완이 바닥과 수직인 상태를 유지한다.\n" +
                        "2. 등 패드에 기대 승모근을 최대한 고립시켜야 한다.\n" +
                        "3. 덤벨이 몸 바깥쪽으로 나가지 않도록 한다.");
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
                Ex_explain.setText("1. 시선보다 약간 위에 위치하도록 벤치에 눕고 어깨 넓이보다 약간 넓게 바벨을 잡는다.\n" +
                        "2. 견갑골을 뒤로 젖힌 후 벤치에 고정을 시키고 허리는 자연스로운 아치를 만든다.\n" +
                        "3. 발은 바닥에 고정시키며 발바닥부터 힘이 생긴다고 생각하면서 지면을 꾹 눌러준다.\n" +
                        "4. 발을 들어 시선이 바와 일치하도록 하며 바를 내릴 때 약간 사선 방향으로 가슴까지 내리다 바를 올려준다.");
                Warning_tx.setText("1. 부상위험이 많은 운동이므로 올바른 자세를 연습 후 중량을 추가한다.");

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
                Ex_explain.setText("1. 벤치의 각도를 30도로 조정한다.\n" +
                        "2. 발바닥을 바닥에 붙이고 허리를 곧게 핀 상태에서 허리는 벤치와 살짝 떨어지도록 유지한다.\n" +
                        "3. 자신의 팔꿈치가 90도까지 접히는 부분까지 내려준다.\n" +
                        "4. 가슴 근육으로만 밀어준다는 느낌으로 올려준다.");
                Warning_tx.setText("1. 가슴을 심하게 내밀지 않는다.");

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
                Ex_explain.setText("1. 벤치에 앉아 두 덤벨을 잡고 허벅지 위에 올려놓는다.\n" +
                        "2. 허벅지를 살짝 튕기면서 덤벨을 가슴쪽으로 가져오면서 눕는다.\n" +
                        "3. 덤벨을 가슴 바깥쪽에 고정하면서 팔꿈치 팔을 90도로 만든다.\n" +
                        "4. 호흡을 내쉬면서 덤벨을 최대한 멀리 올린다는 느낌으로 빠르게 수축하면서 올린다.\n" +
                        "5. 호흡을 들이쉬면서 천천히 내린다.");
                Warning_tx.setText("1. 운동중에 엉덩이가 바닥에서 떨어지지 않도록 한다.\n" +
                        "2. 허리를 아치형으로 들어준다.\n" +
                        "3. 덤벨을 잡을때 손목이 꺾이지 않도록 한다.");

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
                Ex_explain.setText("1. 덤벨을 들고 각도 조절한 벤치에 앉는다.\n" +
                        "2.턱은 가슴 방향으로, 발은 바닥에 딱 붙게, 허리와 엉덩이는 벤치에 밀착해서 붙인다.\n" +
                        "3. 어깨보다 넓게 덤벨을 잡습니다.\n" +
                        "4. 가슴 위로 올렸다가 가슴 위치로 돌아온다.");
                Warning_tx.setText("1. 덤벨을 모을 때는 팔이 부딪히지 않도록 주의한다.\n" +
                        "2. 전완근이 수직을 유지한다.\n" +
                        "3. 반동이 일어나지 않게 한다.");

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
                Ex_explain.setText("1. 케이블 머신의 도르래를 가장 아래쪽으로 세팅한다.\n" +
                        "2. 양손으로 그립을 잡고 한쪽발을 앞으로 내딛어 머신 중앙에 선다.\n" +
                        "3. 그 상태로 양손의 그립을 모으며 자신의 얼굴 높이까지 들어올린다.");
                Warning_tx.setText("1. 과한 중량은 부상 위험이 있으므로 본인에게 맞는 중량으로 한다.");

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
                Ex_explain.setText("1. 딥스 바 위에 두 손을 짚고 올라선다.\n" +
                        "2. 무릎을 구부리고 엉덩이를 뒤로 살짝 빼고 코어에 힘을 주어 중심을 잡는다.\n" +
                        "3. 가슴을 바닥 쪽으로 숙이면서 팔꿈치가 90도가 될 때까지 저항을 느끼며 몸을 내려준다.\n" +
                        "4. 가슴 하부를 수축시키며 위로 올라오면서 처음 준비자세로 돌아온다.");
                Warning_tx.setText("1. 너무 과하게 내려갈 경우 어깨나 팔꿈치에 부상을 입을 우려가 있다.");

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
                Ex_explain.setText("1. 양발을 어깨 너비로 벌리고 상체는 고정한다.\n" +
                        "2. 팔꿈치는 고정하고 손을 어깨로 올리는 느낌으로 들어 올린다.\n" +
                        "3. 팔을 천천히 펴준다.");
                Warning_tx.setText("1. 허리가 꺾이지 않도록 주의한다.");

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
                Ex_explain.setText("1. 덤벨을 손바닥을 마주본 상태로 잡아준다.\n" +
                        "2. 다리의 보폭은 골반의 넓이만큼 벌려 중심을 잡아준다.\n" +
                        "3. 가슴을 열고 팔꿈치를 고정시킨 뒤 큰원을 그린다 생각하며 팔을 접어준다.");
                Warning_tx.setText("1. 팔꿈치는 고정한다고 생각한다.\n" +
                        "2. 하체의 반동을 최소화 한다.");

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
                Ex_explain.setText("1. 다리는 골반 너비만큼 벌리고 선 후 양손에 덤벨을 잡는다.\n" +
                        "2. 팔꿈치를 옆구리에 고정시킨 후 한쪽 팔씩 덤벨을 들어준다.\n" +
                        "3. 천천히 내렸다가 반대쪽 손에 잡은 덤벨을 들어 올려준다.");
                Warning_tx.setText("1. 팔꿈치가 앞으로 나가면 안된다.\n" +
                        "2. 팔꿈치가 옆구리를 누르지 않게 자연스럽게 밀착시켜 준다.\n" +
                        "3. 본인에게 맞는 무게를 정해서 진행해 준다.");

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
                Ex_explain.setText("1. 다리를 V자로 넓게 벌리고, 허리를 45도 정도 구부린 채로 벤치의 끝에 앉는다.\n" +
                        "2. 오른손에 덤벨을 쥐고 오른쪽 허벅지 안쪽에 팔꿈치를 고정 시킨다.\n" +
                        "3. 호흡을 내쉬며 덤벨을 가슴까지 올린다.\n" +
                        "4. 반동 없이 팔꿈치를 고정시킨 채로 덤벨을 내린다.");
                Warning_tx.setText("1. 덤벨을 내릴 때 힘 없이 떨어지면 팔꿈치 부상을 당할 수 있다.\n" +
                        "2. 팔꿈치의 위치가 바뀌지 않도록 고정해야 한다.");

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
                Ex_explain.setText("1. 먼저 양발을 편하게 맞춰서 서준 뒤 바벨은 오버그립으로 잡는다.\n" +
                        "2. 양쪽 팔꿈치는 잘 고정시켜주면서 바벨을 팔꿈치로 구부린다는 느낌으로 들어서 올려준다.");
                Warning_tx.setText("1. 팔꿈치가 앞으로 나가지 않게 잘 고정한다.\n" +
                        "2. 손목이 아래로 꺾이게 되면 손목에 무리가 갈 수 있으니 손목은 항상 꺾이지 않게 주의해줘야 한다\n" +
                        "3. 운동시 어깨가 말리거나 허리가 꺾이지 않게 척추의 중립을 잘 잡아준다");

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
            case "클로즈그립 벤치 프레스":
                exerciseName.setText("클로즈그립 벤치 프레스");
                Ex_explain.setText("1. 머리를 벤치에 대고 발바닥은 지면에 확실히 밀착을 시켜 준다.\n" +
                        "2. 그 상태로 벤치에 누워 어깨 너비보다 약간 좁게 팔을 벌려 오버핸드 그립으로 바를 잡아준다.\n" +
                        "3. 이 자세에서 팔을 펴면서 바벨을 들어 올려 준다.\n" +
                        "4. 바벨을 반드시 안정적으로 지탱한 상태에서 팔꿈치를 천천히 구부리며 가슴을 향해 바벨을 내린다.\n" +
                        "5. 주먹이 가슴에 닿을 때까지 바벨을 내려준다.\n" +
                        "6. 발바닥을 지면에 더욱 강하게 밀착 시키고 팔꿈치가 벌어지지 않도록 주의 하면서 바벨을 어깨로 부터 수직으로 들어 올린다.\n" +
                        "7. 팔을 펴면서 시작 자세로 돌아간다.");
                Warning_tx.setText("1. 동작을 취할때 발을 지면에 밀착 시키지 않으면 허리가 뒤틀리기 때문에 허리에도 부상을 입을 수 있다.");

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
                Ex_explain.setText("1. 손바닥이 위쪽을 향하게 하여 덤벨을 머리 위로 올려준다.\n" +
                        "2. 팔꿈치는 정면을 보이도록 하고 머리 옆에 고정시키고 허리를 펴준다.\n" +
                        "3. 팔꿈치를 90도 정도로 천천히 내려준다.");
                Warning_tx.setText("1. 운동중 팔꿈치가 움직이거나 양옆으로 벌어지지 않도록 한다.");

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
                Ex_explain.setText("1. 누워서 가슴을 살짝 들어주고 허리는 아치로 만든다.\n" +
                        "2. 덤벨을 잡고 어깨를 머리방향으로 덤벨을 올려준다.\n" +
                        "3. 팔꿈치를 양쪽이 서로 평행이 되게끔 맞추고 머리 이마 방향으로 내려준다.\n" +
                        "4. 덤벨을 내린 궤적 그대로 팔꿈치를 고정시킨 후, 그대로 올린다.");
                Warning_tx.setText("1. 어깨가 움직이지 않도록 고정시킨다.\n" +
                        "2. 팔꿈치가 안쪽이나 바깥쪽에서 벌어지지 않도록 고정시킨다.");

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
                Ex_explain.setText("1. 양손에 덤벨을 잡고 양발은 어깨 너비로 나란히 둔다.\n" +
                        "2. 등과 어깨가 굽지 않도록 지면과 수평에 가깝게 숙인다.\n" +
                        "3. 팔꿈치 관절을 고정한 채로 반원을 그리며 뒤로 밀어준다.");
                Warning_tx.setText("1. 지나친 반동을 가져가지 않도록 주의한다.");

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
                Ex_explain.setText("1. 풀업바를 어깨너비보다 약간 넓게 잡는다.\n" +
                        "2. 어깨의 힘을 완전히 풀어놓고 매달려 있는 자세로 시작한다.\n" +
                        "3. 견갑골을 모아주면서 올라간다.\n" +
                        "4. 내려올 때 힘을 뺴서 내려오는 것이 아니라 근육의 이완을 느끼며 천천히 내려온다.");
                Warning_tx.setText("1. 본인 체중으로 하기 힘들 경우 풀업 밴드나 머신을 이용한다.");

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
                Ex_explain.setText("1. 머신 앞 허벅지고정 패트에 허벅지를 밀착시킨 후 몸이 흔들리기 않게 고정 시킨다.\n" +
                        "2. 발바닥은 바닥에 붙이고 뒷꿈치를 들지 않는다.\n" +
                        "3. 바는 어깨 넓이 1.5배 정도로 넓게 바를 잡는다.\n" +
                        "4. 호흡을 내쉬면서 바를 가슴 상단으로 당기는데 이때 상체를 뒤로 약간 젖힌다.\n" +
                        "5. 당긴 후 자세를 2~3초 정도 유지한다.");
                Warning_tx.setText("1. 이완하는 과정에서 팔을 너무 쭉 필 경우 긴장이 풀릴 수 있기 때문에 80% 정도만 펴준다.\n" +
                        "2. 하체를 단단히 고정하여 동작간 상하체 반동을 최소화 한다.\n" +
                        "3. 팔꿈치가 뒤로 빠지지 않도록 한다.");

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
                Ex_explain.setText("1. 배와 엉덩이, 골반, 하체에 힘을 주고 바로 선다.\n" +
                        "2. 위의 힘을 유지한체 몸을 앞으로 기울인다.\n" +
                        "3. 등근육의 힘을 주고 바벨을 지면과 수직방향으로 잡아당긴다.");
                Warning_tx.setText("1. 허리의 부담을 줄이기 위해 요추의 정상적인 만곡을 유지한다.");

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
                Ex_explain.setText("1. 한 쪽 손에 덤벨을 잡고 반대쪽 무릎을 벤치에 올려 같은 손으로는 상체를 받쳐 등을 곧게 편 상태를 만든다.\n" +
                        "2. 허리는 바로 펴서 시선은 앞을 바라보고 덤벨을 잡은 팔을 광배근을 완전히 펴서 바닥에 늘어 뜨린다.\n" +
                        "3. 덤벨을 광배근을 이용해 팔꿈치가 몸통을 스치듯 몸과 가까이 하여 덤벨을 잡아 당긴다.\n" +
                        "4. 몸통은 좌우로 비틀지 말고 곧게 유지하며 광배근으로만 덤벨을 최대로 높게 올린 다음 시작 자세로 돌아간다.");
                Warning_tx.setText("1. 가슴이 말리지 않게 척추를 곧게 펴주며 팔꿈치가 바깥으로 벌어지지 않게 한다.\n" +
                        "2. 골반의 좌우 높이가 같아야 한다.\n" +
                        "3. 손목이 안쪽이나 바깥쪽으로 꺾이지 않게 한다.");

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
                Ex_explain.setText("1. 두 덤벨을 뉴트럴 그립으로 잡고 상체를 살짝 숙인 후 무릎을 구부려 엉덩이를 살짝 뒤로 빼준다.\n" +
                        "2. 몸의 중심이 앞으로 가 있는 상태에서 팔을 앞으로 빼고 광배근을 늘려준다.\n" +
                        "3. 그 상태로 양 팔을 광배근 사이로 수축시켜준다.");
                Warning_tx.setText("1. 본인이 들 수 있는 무게를 설정한 후 무리하지 않고 운동을 진행한다.");

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
                Ex_explain.setText("1. 기구에 정면으로 앉아 발을 발판에 고정시키고 무릎을 살짝 구부린 상태에서 앉는다.\n" +
                        "2. 허리를 곧게 편 상태를 유지하고 상체를 숙여 그립을 잡아 팔꿈치를 편 상태로 준비한다.\n" +
                        "3. 가슴을 내밀어 견갑을 잡아주고 어깨가 올라가지 않도록 고정해준다.\n" +
                        "4. 가슴은 항상 열려있는 상태를 유지하며 팔꿈치를 뒤로 당겨 견갑이 가운대로 모이도록 당겨준다.");
                Warning_tx.setText("1. 등이 말리지 않도록 한다.\n" +
                        "2. 어깨가 위로 올라가지 않도록 한다.\n" +
                        "3. 반동을 이용하지 않아야 한다.");

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
                Ex_explain.setText("1. 허리를 숙이고 엉덩이를 뒤로 뺴며 그립을 잡는다.\n" +
                        "2. 흉곽은 열어주고, 목과 척추가 중립이 되도록 잡아준다.\n" +
                        "3. 그립을 잡은 손이 배꼽쪽으로 오도록 당겨 광배근을 수축해준다.");
                Warning_tx.setText("1. 허리가 굽지 않게 하고, 팔꿈치가 너무 벌어지지 않도록 주의한다.");

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
                Ex_explain.setText("1. 발을 어깨너비로 벌려주고 그립은 어깨너비보다 살짝 넓게 바를 잡아준다.\n" +
                        "2. 어깨를 내리고 뒤로 고정시켜준 뒤 팔을 펴준다.\n" +
                        "3. 허리는 굽어서도 안되고 과하게 아치형을 만들지 않은 중립 상태로 둔다.\n" +
                        "4. 시선은 정면을 보고 허리를 핀 상태로 엉덩이를 뒤로 뺀다는 느낌으로 앞으로 숙여준다.\n" +
                        "5. 천천히 다리를 타고 내려간다.\n" +
                        "6. 무릎 아래 정강이까지 내려가면 허리와 복부에 긴장을 준 채 허리와 무릎을 펴고 몸으로 바를 들어 올린다.");
                Warning_tx.setText("1. 등이 굽지 않도록 곧게 편 자세로 해야 한다.\n" +
                        "2. 상체를 숙인 상태에서 무릎을 먼저 피게 되면 허리에 부상을 입을 수 있다.\n" +
                        "3. 가슴을 내밀고 복근과 허리에 긴장감을 유지한다.");

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
                Ex_explain.setText("1. 머신에 앉아 엉덩이 시트 끝에 밀착시킨 후 양발을 발판에 어깨 너비만큼 벌린 다음 무릎을 펴준다. \n" +
                        "2. 옆에 있는 안전바를 옆으로 풀어준 다음 발과 무릎이 일직선이 되게 한다음 천천히 무릎을 몸쪽으로 굽힌다.\n" +
                        "3. 무릎이 안쪽으로 말리지 않도록 방향을 일직선으로 유지하며 천천히 밀어준다.");
                Warning_tx.setText("1. 무릎을 완전히 펴지 않고 살짝 구부려야 무릎 부상을 피할 수 있다.");

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
                Ex_explain.setText("1. 어깨 너비 정도로 다리를 벌려준 뒤에 발끝은 11자로 앞을 향하게 선다.\n" +
                        "2. 복부의 힘을 준 뒤에 바르게 선 상태에서 천천히 앉는다.");
                Warning_tx.setText("1. 무릎은 발끝과 같은 방향이지만 발끝보다 앞으로 나가지 않도록 한다.");

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
                Ex_explain.setText("1. 양발을 어깨너비 정도 벌리고 서서 오버핸드 그립으로 바를 잡아 흉근 상단에 올려놓는다.\n" +
                        "2. 상체가 앞으로 고꾸러지지 않도록 숨을 깊이 들이쉬어 흉강 내압을 유지하되, 등은 살짝 아치를 만들고 복근을 수축하여 다리를 수평지점까지 굽혀준다.");
                Warning_tx.setText("1. 모든 체중이 앞다리에 실리고 균형감각도 필요한 운동으로 무릎을 보호하기 위해 저중량 부터 사용한다.");

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
                Ex_explain.setText("1. 발은 어깨 넓이로 벌리고 양 팔은 옆구리에 일직선으로 논다.\n" +
                        "2. 공간을 넓게 가져가며 한쪽발을 앞으로 넓게 빼준 후 대퇴사두근이 지면과 평행하게 만날때 까지 무릎을 굽혀준다.\n" +
                        "3. 상체는 숙이지 않고 일자를 유지한 후 복압을 잡아둔 상태에서 한발 씩 천천히 내려가 준다.\n" +
                        "4. 앞으로 나간 발에 뒷꿈치를 누르며 다시 올라온다.");
                Warning_tx.setText("1. 무릎이 발바닥보다 앞으로 나가지 않게 해준다.\n" +
                        "2. 내려가는 지점에서 몸은 중심을 바로서게 유지한다.");

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
                Ex_explain.setText("1. 바벨을 잡고 등을 곧게 유지한 채 선다.\n" +
                        "2. 고개를 들어 정면을 보되, 힙은 뒤로 빼주고 상체는 그대로 밑으로 내려간다.");
                Warning_tx.setText("1. 내려갈 때 골반이 말리지 않도록 고정해야 한다.");

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
                Ex_explain.setText("1. 팔꿈치와 어깨를 일직선으로 하여 바닥을 짚어준다.\n" +
                        "2. 팔꿈치와 발가락, 복부 힘으로 균형을 맞추며 버틴다.\n" +
                        "3. 팔꿈치는 90도가 되도록 한 다음 머리부터 발끝까지 일직선을 만들어 준다.");
                Warning_tx.setText("1. 견갑골과 쇄골은 전체적으로 뒤로 밀리지 않게 단단히 고정시켜 준다.\n" +
                        "2. 어깨는 방향이 지면과 수직을 이루도록 해주시되 허리는 머리부터 발끝까지 최대한 곧게 뻗어야 한다.");

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
                Ex_explain.setText("1. 바닥에 무릎을 구부린 채로 댄다.\n" +
                        "2. AB슬라이드를 잡고 상체를 앞으로 숙여준다.\n" +
                        "3. 가능한 가동범위까지 앞으로 밀어준다.\n" +
                        "4. 다시 처음 위치로 상체를 당기며 되돌아 온다.");
                Warning_tx.setText("1. 복근뿐만 아니라 전신에 자극이 가는 운동이므로 조심히 사용한다");

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
