package com.zyc.nevergiveup;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class KoreanAcitvity extends AppCompatActivity {
    public static final String KOREAN_NAME="korean_name";
    public static final String KOREAN_IMAGE_ID="korean_image_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean);
        Intent intent=getIntent();
        String koreanName=intent.getStringExtra(KOREAN_NAME);
        int koreanImageId=intent.getIntExtra(KOREAN_IMAGE_ID,0);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        CollapsingToolbarLayout collapsingToolbar=(CollapsingToolbarLayout)findViewById(R.id.collapsing_toolbar);
        ImageView koreanImageView=(ImageView)findViewById(R.id.korean_image_view);
        TextView koreanContentText=(TextView)findViewById(R.id.korean_content_text);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        collapsingToolbar.setTitle(koreanName);
        Glide.with(this).load(koreanImageId).into(koreanImageView);
        {
            if (koreanName.equals("关于韩国"))
                koreanContentText.setText("大韩民国（韩语：대한민국），简称韩国，别称南韩或南朝鲜。位于东亚朝鲜半岛南部，总面积约10万平方公里（占朝鲜半岛总面积的45%），主体民族为朝鲜族，通用韩语，总人口约5041.85万（2014年）。首都为首尔（旧称：汉城；谚文：서울）。  \n" +
                        "韩国三面环海，西濒临黄海，东南是朝鲜海峡，东边是东海/日本海（韩国称其东海，日本称其日本海），北面隔着三八线非军事区与朝鲜相邻。朝鲜半岛历史上长期是中国王朝的附属国，清末中国在甲午战争中战败，正式脱离与中国的藩属关系。1910年朝鲜半岛正式并入日本领土，二战后光复取得独立。1950年爆发朝鲜战争，南北分裂，北方国家称朝鲜，南方国家称韩国。  二战后，特别是20世纪60年代以来，韩国政府实行了“出口主导型”开发经济战略，创造了被称为“汉江奇迹”的经济高速增长期。\n" +
                        "韩国是一个新兴的资本主义国家，是APEC、世界贸易组织和东亚峰会的创始成员国，也是经合组织、二十国集团和联合国等重要国际组织的成员。1997年亚洲金融危机后，韩国经济进入中速增长期。产业以制造业和服务业为主，钢铁、造船、汽车、电子、半导体、化工、文化、纺织等产业产量均进入世界前10名。大企业集团在韩国经济中占有十分重要的地位，目前主要大企业集团有三星、现代汽车、SK集团、LG等。 \n\n\n"+"韩文（使用百度翻译）\n"+"대한민국 (한국어: 성미: 대 한 국), 한국, 풀이 남한 / 남조선.에 동아시아 한반도 남부 총 면적은 약 10만 평방 킬로미터 (전체 한반도 총면적의 45%) 을 위해 주요 민족 조선족, 일반 한국어, 전체 인구의 약 5041.85 만 (2014년).수도인 서울 (옛 불리는: 서울; 글: 서울 울 맞들다).[1-2]               한국은 삼면이 바다로 둘러싸이다 서쪽 황해에 인접해 있다, 동남 조선 해협, 동쪽, 동해 / 일본 (한국 불리는 그 동해 일본 불리는 그 일본), 북쪽 사이에 두고 삼팔선 비무장지대 과 조선 인접해 있다.한반도 역사상 장기 중국의 왕조 속국, 청나라 중국은 갑오 전쟁 중에 패전, 정식으로 이탈 및 중국 속국.1910 년 한반도 정식으로 병합 일본 영토 2차 세계대전 후 독립 광복 얻다.1950년 폭발 한국 전쟁, 남북 분단 국가 불리는 북방 남쪽 나라 한국, 조선, 말했다.[2]   제2차 세계대전 후, 특히 1960년대 이후 한국 정부가 시행 수출 주도하는 개발 경제 전략 형 으로 불리는 '한강의 기적 경제 고속 성장 기간 을 계속 이른바 아시아 사 용 중의 하나다.             한국 은 신흥 자본주의 국가, APEC, 세계 무역 기구 및 동아시아 정상회담 창립 회원국 또한 경제협력개발기구, 스무 나라 그룹, 유엔 등 중요한 국제 조직의 구성원.1997년 아시아 금융 위기 이후 한국 경제 진입 중속도 성장 기간.제조업과 서비스 산업을 위주로, 철강, 조선, 자동차, 전자, 반도체 · 화학 · 문화 · 섬유 등 산업 생산량이 모두 세계 전 10명의.큰 거쳐 한국 경제에서 매우 중요한 지위를 차지하고 있다, 지금은 주로 어떤 큰 기업집단이 삼성 · 자동차 · SK그룹이 · LG 등.[3]" );
            else if (koreanName.equals("韩国景点"))
                koreanContentText.setText("济州岛  \n\n"+"济州岛是韩国最大的岛屿，位于朝鲜半岛最南端，是有着神秘的自然景观和固有的传统文化的美丽岛屿，被世人称为“和平之岛”。小说《25时》的作家乔治称“济州使人生得救了”，美国前总统克林顿称赞它是“诸神之岛”。 济州岛的地貌十分奇特，处处岩浆凝石。当年熔岩流经的地方，形成了千奇百怪的熔洞、熔柱，展现了特有的神韵。随着时间的推移，济州岛已披上了绿装。岩石丛中树木挺拔，泥土地里芳草萋萋，瀑布宛如银河飞泻，又如条条白练，给济州岛蒙上了一层神秘的色彩。\n" +
                        "最佳季节：3-5月、9-10月。每年的春秋时节，是济州岛最美丽的时候；不过要说旅游旺季，还当数9-10月秋高气爽的时节。春季的济州岛晴朗爽利，但比起秋天来说少了一份含蓄的美丽。在金秋时节前往济州岛，踏着满地落叶行走在精致的小巷中，自有一种安闲的悠然。   \n\n"+"首尔   \n\n" + "韩国首都首尔（Seoul）是韩国政治、经济、文化和教育的中心，也是全国陆、海、空交通枢纽。位于朝鲜半岛中部、地处盆地，汉江迂回穿城而过。首尔是世界第10大城市，在这座城市里古与今以奇妙的方式并存。朝气蓬勃的人群、繁华喧闹的城市、迷人的自然景观、悠久的历史文化。充满活力的首尔到处呈现出令人心动的景象，无论是漫游幽雅富丽的故宫遗址，还是寮默于大自然的怀抱，整个旅程都会留给游客鲜明的印象和新奇的感受。位于市中心的摩天大楼鳞次栉比，汉江两岸的高级公寓星罗棋布，一派现代化都市景象。首尔还是韩国的文化、教育中心，设有汉城大学、高丽大学等大专院校34所。首尔有三角山、冠岳山、仁旺山、景福宫、德寿宫、昌德宫等名胜古迹。市区内的浓荫下，古老的宫殿、庙宇等同直入云霄的现代建筑群交相辉映，显示了首尔既古老又现代的历史和时代风貌。 \n\n"+"釜山\n\n"+"釜山永远是奔波沸腾的，人、鱼、海鲜拥塞市场与街巷，港都风情煞是浓。这里，船只浮游，海洋波光粼粼，名刹生生世世。釜山地处气候较暖的韩半岛南端，拥有韩国最大最有名的天然港口，也是韩国南端的门户。人口约380万，是工业和商业的中心，也是韩国的第二大城市。1950年朝鲜战争爆发期间，釜山曾为韩国的临时首府，1963年升为中央直辖市。20世纪初，随着釜山至首尔铁路的开通，釜山港迅速发展起来。\n" +
                        "最佳季节：3-5月、9-11月。春秋两季最佳，釜山靠海，春秋季节最清爽，适合旅游。不过要是想要吃海鲜，还得是夏天。");
            else if (koreanName.equals("学习韩语对英语的影响"))
                koreanContentText.setText("影响一：泡菜味的英语发音\n" +
                        " \n" +
                        "韩语中有许多外来词，是根据英语发音念的，但这种发音欧美人绝对听不懂啊！比如Christmas，韩语中是크리스마스。\n" +
                        " \n" +
                        "久而久之，再也找不回英语发音了…电梯怎么读？电视怎么读？电脑怎么读？!别说分什么美音英音了，只要不是泡菜音就好。\n" +
                        " \n" +
                        "影响二：颠倒错乱的语法逻辑\n" +
                        " \n" +
                        "韩语的语法逻辑我们提到过多次，是主宾谓的结构，学韩语时间久了，中文倒是不会说成我饭吃，但真的很容易脱口而出：I dinner eat啊！\n" +
                        " \n" +
                        "影响三：无法避免的遗忘规律\n" +
                        " \n" +
                        "很多学韩语的同学都有这样的经验：刚学韩语时说话常常用英语单词，韩语学久了说英语时脑海里就全是韩语单词了！\n" +
                        " \n" +
                        "而且这种情况不断反复，认真学韩语就忘了英语，想重新捡起英语，韩语就退步迅速，两门语言一起学简直要变成精分…\n" +
                        " \n" +
                        " \n" +
                        "但奇怪的是，身边还是有很多英韩，甚至多国语言俱佳的大神存在。他们在以上定律下是如何突围成功的呢？\n\n"+"我也不清楚");
            else if (koreanName.equals("韩语造句"))
                koreanContentText.setText("줄곧~ 해요 一直…… \n\n"+"1. 一直往前走。계속 앞으로 가요.\n" +
                        " \n" +
                        "2. 一直下雨。줄곧 비가 와요.\n" +
                        " \n" +
                        "3. 一直很安静。줄곧 매우 조용해요.\n" +
                        " \n" +
                        "4. 一直想着你。계속 당신을 그리워하고 있어요.\n" +
                        " \n" +
                        "5. 一直在等你。줄곧 너를 기다리고 있어.\n\n"+" 아직 ~하지 않았어요 还没…… \n" +
                        " \n" +
                        "1. 还没吃。아직 밥 안 먹었어.\n" +
                        " \n" +
                        "2. 还没来。아직 안 왔어 .\n" +
                        " \n" +
                        "3. 还没决定。아직 결정을 안 했어.\n" +
                        " \n" +
                        "4. 还没找到。아직 찾아내지 못했어.\n" +
                        " \n" +
                        "5. 还没准备。아직 준비하지 못했어.\n" +
                        "  更……더~해요 \n\n" +
                        " \n" +
                        "1. 她比我更大。그는 나보다 나이가 더 많아요.\n" +
                        " \n" +
                        "2. 我比他更高。나는 그보다 키가 더 커요 .\n" +
                        " \n" +
                        "3. 飞机比火车更快。비행기가 기차보다 더 빨라요.\n" +
                        " \n" +
                        "4. 今天比昨天更冷。오늘이 어제보다 더 추워요.\n" +
                        " \n" +
                        "5. 汉语比英语更容易。중국어가 영어보다 더 쉬워요.\n"+"\n"+" 只……단지~해요 \n" +
                        " \n" +
                        "1. 只说了一遍。단지 한 번만 말했어요.\n" +
                        " \n" +
                        "2. 只看了一次。단지 한 번만 봤어요 .\n" +
                        " \n" +
                        "3. 只去了一次。단지 한 번만 갔어요.\n" +
                        " \n" +
                        "4. 只相信你。오직 너만 믿어.\n" +
                        " \n" +
                        "5. 只喜欢音乐。오직 음악만 좋아해.\n\n"+"很…… 가장~해요\n" +
                        " \n" +
                        "1. 她很可爱。이 책이 제일 좋아요.\n" +
                        " \n" +
                        "2. 他很帅。그녀가 가장 예뻐요.\n" +
                        " \n" +
                        "3. 中国人很热情。그가 제일 똑똑해요.\n" +
                        " \n" +
                        "4. 这首歌很好听。이 요리가 제일 맛있어요.\n" +
                        " \n" +
                        "5. 这个节目很有意思。이 시합이 가장 멋져요.\n\n\n"+"如果你感兴趣，可以访问http://kr.tingroom.com/hykyu/cjhghh了解更多造句");
            else if (koreanName.equals("韩国食物"))
                koreanContentText.setText("泡菜\n\n"+"具有韩国代表性之一的泡菜是韩国人餐桌上必不可少的发酵食品。将腌制的白菜萝卜等加入调料，成为开胃的酸辣食品，受到人们强烈的喜爱。\n\n"+"拌饭\n\n"+"与泡菜一同被列为韩国代表饮食的拌饭，作为韩国最高传统饮食，是在白米饭上拌上炒肉，各种各样的青菜，与辣椒酱或调料等一起拌着吃。不仅可口，有益健康，而且制作容易，食用方便，成为飞机上的最佳饮食。拌饭的故乡全州有很多著名的小吃店，在首尔也有很多知名的拌饭店。\n\n"+"烤肉\n\n"+"韩国的烤五花肉，先烤好了再剪开，这样的烤肉真的是香呀！而且韩国的肉其实也不是那么贵，他们普通的肉其实还是很便宜的。\n\n"+"鱼丸\n\n"+"路边小吃帐篷摊子里卖的通常是穿成串的鱼丸，所以也叫鱼丸串。将碾碎的鱼肉做成鱼丸用水煮着吃，加点萝卜、葱、海带煮成的清汤味道更好，不是很辣，寒冷的冬天里和炒年糕一起吃，尤其受小孩和外国人的欢迎。还有更好吃的办法就是蘸着葱酱吃，近来还在汤里放入辣椒酱煮成微辣的鱼丸汤也很好吃。\n\n"+"想了解更多，可以访问https://lvyou.baidu.com/hanguo/meishi/");
            else if (koreanName.equals("韩国大学"))
                koreanContentText.setText("首尔大学\n\n"+"首尔大学（Seoul National University，서울대학교），全称为国立首尔大学，简称首尔大，位于韩国首都首尔，原名为国立汉城大学。前任联合国秘书长潘基文及多位韩国总统均出身于首尔大学。\n" +
                        "首尔大学是韩国的最高学府，世界著名大学、亚洲顶尖的研究型国立综合大学之一，是亚洲大学联盟、环太平洋大学联盟（Association of Pacific Rim Universities）、东亚四大学论坛（BESETOHA ）和东亚研究型大学协会（The Association of East Asian Research Universities）的成员之一。[1]  \n" +
                        "首尔大学在2016-2017年QS世界大学排名中排名全球大学第35位，亚洲大学第10位，韩国大学第一位[2-3]  。该校在2016-2017年泰晤士(Times)世界大学排名中位于全球第72位[4]  ,在世界大学学术排名2016（ARWU）中位于全球第101-150位[5]  。\n\n"+"延世大学\n\n"+"延世大学（Yonsei University）位于韩国首尔，是一所基督教私立研究型综合大学，位列韩国顶尖大学第2位，与首尔大学（Seoul National University）和高丽大学（Korea University）被称为韩国大学的一片天（S.K.Y.）。\n" +
                        "延世大学创建于1885年，是韩国历史最为悠久的大学之一。2011年，该校在亚洲大学中排名第16位，在法国国立巴黎高等矿业学校（EMP）基于各校毕业生在《财富》杂志发布的世界500强企业中担任首席执行官的人数指标进行的世界大学排名中列第89位。2015年，该校在QS世界大学排名中排在第105位。[1]  在2016-2017年泰晤士(Times)世界大学排名中位于全球第251-300位。\n\n"+"高丽大学\n\n"+"高丽大学（Korea University），简称高丽大，是韩国最大的私立研究型综合大学，设有两大校区，分别为安岩校区和世宗校区。是亚太国际教育协会发起成员、亚太国际贸易教育与研究联盟（PACIBER）的成员和Universitas 21的创始会员，世界大学100强之一。它始建于1905年，由大韩帝国大臣李容翊创立，前身为普成学校。[1-2]  \n" +
                        "韩国高丽大学历史悠久，目前在韩国大学排名第2位，私立大学第1位。在QS世界大学排名2015/16中，高丽大学位居世界第104位[3]  ，并于2016年跃升至QS世界大学排名第98位[4]  。该校在2016-2017年泰晤士(Times)世界大学排名中位于全球第201-250位,[5]  在世界大学学术排名2016（ARWU）中位于全球第151-200位[6]  。高丽大学对韩国在政治、经济、社会、文化等各领域的发展起到了积极的作用。高丽大学现约有35000名学生, 4900名的教授阵容以及900名教职员工[7]  。两个校区共设置了17个单科大学，83个学科，24个大学院，89个各种研究所等教学研究机构[7]  。高丽大学依据韩国特性，继承、发展和独创了各学科教育，以国际化、情报化等未来发展前沿学科为目标，努力致力于各国学术间的交流。");
            else if (koreanName.equals("韩国动漫"))
                koreanContentText.setText("不做推荐。\n\n"+"日漫最棒。");
            else if (koreanName.equals("韩国游戏"))
                koreanContentText.setText("......");

        }

        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
