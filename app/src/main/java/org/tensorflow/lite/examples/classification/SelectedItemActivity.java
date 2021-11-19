package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SelectedItemActivity extends AppCompatActivity {

    String recognitionkey;
    TextView title,desc,lbl_causes,causes,lbl_diag,diagnosed,lbl_treated,treated,lbl_prevent,prevent;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_item);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            recognitionkey = extras.getString("k");
        }else {
            Toast.makeText(this, "error no key", Toast.LENGTH_SHORT).show();
        }

        title = findViewById(R.id.title_asi);
        desc = findViewById(R.id.about_asi);
        iv = findViewById(R.id.iv_asi);

        causes = findViewById(R.id.cause_asi);
        lbl_diag = findViewById(R.id.lbl_diagnosed);
        diagnosed = findViewById(R.id.dia_asi);
        lbl_treated = findViewById(R.id.lbl_treated);
        treated = findViewById(R.id.treated_asi);
        lbl_prevent = findViewById(R.id.lbl_prevent);
        prevent = findViewById(R.id.prevent_asi);


    }

    @Override
    protected void onStart() {
        super.onStart();

        if(recognitionkey.equals("0")){
            iv.setImageResource(R.drawable.abs);
            title.setText("Abscess");
            desc.setText("A skin abscess is a tender mass generally surrounded by a colored area from pink to deep red. Abscesses are often easy to feel by touching. The vast majority of them are caused by infections. Inside, they are full of pus, bacteria and debris. Painful and warm to touch, abscesses can show up any place on your body. The most common sites on the skin in your armpits (axillae), areas around your anus and vagina (Bartholin gland abscess), the base of your spine (pilonidal abscess), around a tooth (dental abscess), and in your groin. Inflammation around a hair follicle can also lead to the formation of an abscess, which is called a boil (furuncle). Unlike other infections, antibiotics alone will not usually cure an abscess. In general an abscess must open and drain in order for it to improve. Sometimes draining occurs on its own, but generally it must " +
                    "be opened with the help of a warm compress or by a doctor in a procedure called incision and drainage (I&D).");
            causes.setText("When our normal skin barrier is broken, even from minor trauma, or small tears, or inflammation, bacteria can enter the skin. An abscess can form as your body's defenses try to kill these germs with your inflammatory response (white blood cells = pus). Obstruction in a sweat or" +
                    " oil (sebaceous) gland, or a hair follicle or a pre-existing cyst can also trigger an abscess. ");
            lbl_diag.setText("How Is Abscess Diagnosed?");
            diagnosed.setText("An X-ray of the aching tooth can help identify an abscess. Your dentist may also use X-rays to determine whether the infection has spread, causing abscesses in other areas. Recommend a CT scan. If the infection " +
                    "has spread to other areas within the neck, a CT scan may be used to assess the extent of the infection.");
            lbl_treated.setText("How Is Abscess Treated?");
            treated.setText("If the abscess is small (less than 1 cm or less than a half-inch across), applying warm compresses to the area for about 30 minutes 4 times daily may help.\n" +
                    "Do not attempt to drain the abscess by squeezing or pressing on it. This can push the infected material into the deeper tissues.\n" +
                    "Do not stick a needle or other sharp instrument into the abscess center, because you may injure an underlying blood vessel or cause the infection to spread.");
            prevent.setText("Maintain good personal hygiene by washing your skin with soap and water regularly.\n" +
                    "\n" +
                    "Take care to avoid nicking yourself when shaving your underarms or pubic area.\n" +
                    "Seek immediate medical attention for any puncture wounds, especially if:\n" +
                    "You think there may be some debris in the wound.\n" +
                    "The puncture wound was caused by a bite - human, insect or animal.\n" +
                    "You have one of the listed medical conditions.\n" +
                    "You are on steroids or chemotherapy.");
            lbl_prevent.setText("Can Abscess   Be Prevented?");
        }
        else if(recognitionkey.equals("1")){
            iv.setImageResource(R.drawable.acan);
            title.setText("Acanthosis Nigricans");
            desc.setText("Acanthosis nigricans can affect otherwise healthy people, or it can be associated with certain medical conditions. Sometimes acanthosis nigricans is congenital (something a person is born with). It also can occur as a result of obesity or an endocrine (glandular) disorder. It is frequently found in obese people with diabetes or a tendency towards diabetes and is most common among people of " +
                    "African descent. There are many other possible causes of acanthosis nigricans, including:");
            causes.setText("Most people with acanthosis nigricans have an insulin level that is higher than that of people of the same weight who don't have acanthosis nigricans. Eating too much of the wrong foods, especially starches and sugars, can raise insulin levels.\n" +
                    "\n" +
                    "Rarely, people with certain types of cancer can also develop acanthosis nigricans.");
            diagnosed.setText("The condition can be diagnosed by a doctor through a medical history and physical exam.");
            treated.setText("Eating a special diet can help reduce circulating insulin and may lead to some improvement of the acanthosis nigricans.\n" +
                    "\n" +
                    "Other treatments to improve skin appearance include Retin-A, 20% urea, alpha hydroxyacids, topical vitamin D, and salicylic acid prescriptions. These are only minimally effective, however.");
            prevent.setText("When acanthosis nigricans is related to obesity, weight management is an important part of prevention. A diet that contributes to reduced insulin also can help prevent acanthosis nigricans.\n" +
                    "\n" +
                    "Other preventive strategies include treating medical problems that are linked to acanthosis nigricans (such as hypothyroidism) and avoiding medications that tend to cause or worsen the condition (like birth control pills).");
        }
        else if(recognitionkey.equals("2")){
            iv.setImageResource(R.drawable.ac);
            title.setText("Acne");
            desc.setText("There's a reason it's called \"common acne\" -- nearly everyone suffers from a pimple outbreak at some point in life.\n" +
                    "\n" +
                    "It starts when greasy secretions from the skin's sebaceous glands (oil glands) plug the tiny openings for hair follicles (plugged pores). If the openings are large, the clogs take the form of blackheads: small, flat spots with dark centers. If the openings stay small, the clogs take the form of whiteheads: small, flesh-colored bumps. Both types of plugged pores can develop into swollen, tender inflammations or pimples or deeper lumps or nodules. Nodules associated with severe cases of acne (cystic acne) are firm swellings below the skin's surface that become inflamed, tender, and sometimes infected.\n" +
                    "\n" +
                    "Although acne remains largely a curse of adolescence, about 20% of all cases occur in adults. Acne commonly starts during puberty between the ages of 10 and 13 and tends to be worse in people with oily skin. Teenage acne usually lasts for five to 10 years, normally going away during the early 20s. It occurs in both sexes, although teenage boys tend to have the most severe cases. Women are more likely than men to have mild to moderate forms into their 30s and beyond.\n" +
                    "\n" +
                    "Acne lesions are most common on the face, but they can also occur on the neck, chest, back, shoulders, and upper arms.");
            causes.setText("The cause of acne is not fully understood. Though stress can aggravate acne, it clearly does not cause it.\n" +
                    "\n" +
                    "\n" +
                    "Hormones. Common acne in teenagers starts with an increase in hormone production. During puberty, both boys and girls produce high levels of androgens, the male sex hormones that include testosterone. Testosterone signals the body to make more sebum, the oil produced in the skin's oil glands." +
                    "Bacteria. Excess sebum clogs the openings to hair follicles -- especially those on the face, neck, chest, and back. Bacteria grow in these clogged follicles. This makes blackheads or whiteheads, also known as ''comedones,'' form on the skin's surface. Sometimes, this clogging causes the follicle wall to break under the pressure of this buildup. When this happens, sebum leaks into nearby tissues and forms a pustule or a papule -- this is called inflammatory acne. Larger, tender pustules are called nodules.\n" +
                    "\n" +
                    "Depending on the type of pill, oral contraceptives may trigger acne in some women but suppress it in others. Some injectable contraceptives and intrauterine birth control devices (IUD) may also cause acne. Steroids taken by some bodybuilders and other athletes can also lead to severe outbreaks. ");
            lbl_diag.setText("How Is Acne Diagnosed?");
            diagnosed.setText("A GP can diagnose acne by looking at your skin. This involves examining your face, chest or back for the different types of spot, such as blackheads or sore, red nodules. How severe your acne is will determine where you should go for treatment and what treatment you should have.");
            lbl_treated.setText("How Is Acne Treated?");
            treated.setText("Soap and water. Gentle cleansing of the face with soap " +
                    "and water no more than two times a day can help with acne. However," +
                    " this does not clear up acne that is already present. Aggressive scrubbing " +
                    "can injure the skin and cause other skin problems.Cleansers. There are many cleansers and soaps advertised for treating acne. They often contain benzoyl peroxide, glycolic acid, salicylic acid, or sulfur.\n" +
                    "\n" +
                    "Benzoyl peroxide. For mild acne, you may try, or your doctor may recommend, treatment with a nonprescription drug that contains benzoyl peroxide. It's believed that this compound works by destroying the bacteria associated with acne. It usually takes at least four weeks to work and it must be used continuously to keep acne at bay. Like many over-the-counter and prescription products, it does not affect sebum production or the way the skin follicle cells are shed, and when you stop using it, the acne comes back. It is available in many forms: creams, lotions, washes, foams,cleansing pads and gels. Benzoyl peroxide can cause dry skin and can bleach fabrics, so take care when applying it. Consider wearing an old T-shirt to bed if you are applying it to your back or chest overnight.\n" +
                    "\n" +
                    "\n" +
                    "Salicylic acid. On the skin, salicylic acid helps to correct the abnormal shedding of cells. For milder acne, salicylic acid helps unclog pores to resolve and prevent lesions. It does not have any effect on sebum production and does not kill bacteria. It must be used continuously, just like benzoyl peroxide, because its effects stop when you stop using it -- pores clog up again and the acne returns. Salicylic acid is available in many acne products, including lotions, creams, and pads.");
            prevent.setText("Because of acne's association with fluctuating hormone levels and possible genetic influences, many doctors believe there is no way to prevent it. The accepted wisdom is that neither good hygiene nor diet can prevent outbreaks. Treatments can control acne and minimize future breakouts. Sensible skin care is recommended, especially during adolescence. The basics include a daily bath or shower and washing the face and hands with unscented or mildly antibacterial soap.\n" +
                    "\n" +
                    "Other tips for preventing future outbreaks include:\n" +
                    "\n" +
                    "Use non-comedogenic or sensitive skin products to reduce the chance of new lesions and minimize skin irritation.\n" +
                    "Use a mild cleanser twice a day.\n" +
                    "Avoid cleansers or products that contain scrubbing particles or have a gritty texture. These products can irritate the skin and lead to breakouts.\n" +
                    "Use a daily non-comedogenic moisturizer and broad spectrum sunscreen (SPF 30 with zinc oxide).\n" +
                    "Wear makeup that is non-comedogenic.\n" +
                    "Avoid picking, squeezing, or popping pimples. This can lead to scarring and skin infections.");
            lbl_prevent.setText("Can Acne Be Prevented?");
        }

        else if(recognitionkey.equals("3")){
            iv.setImageResource(R.drawable.ec);
            title.setText("Eczema");
            desc.setText("Eczema symptoms include itchy, red, and dry skin caused by inflammation. It’s most commonly found in children, although adults can get it. It is also called atopic dermatitis and is treated with oral medications, steroid creams and light therapy .");
            causes.setText("Eczema (atopic dermatitis) is caused by a combination of immune system activation, genetics, environmental triggers and stress. Your immune system. If you have eczema, your immune system overreacts to small irritants or allergens. This overreaction can inflame your skin.");
            lbl_diag.setText("How Is Eczema Diagnosed?");
            diagnosed.setText("No lab test is needed to identify atopic dermatitis (eczema). Your doctor will likely make a diagnosis by examining your skin and reviewing your medical history. He or she may also use patch testing or other tests to rule out other skin diseases or identify conditions that accompany your eczema.");
            lbl_treated.setText("How Is Eczema Treated?");
            treated.setText("There is currently no cure for eczema. Treatment for the condition aims to heal the affected skin and prevent flares of symptoms.\n" +
                    "\n" +
                    "Doctors will suggest a treatment plan based on an individual’s age, symptoms, and current state of health.\n" +
                    "\n" +
                    "For some people, eczema goes away over time. For others, however, it is a lifelong condition.");
            prevent.setText("Although there’s no cure for eczema, you can take a lot of simple steps to help keep it in check. And when a flare does happen, your doctor can help you with various treatment options. Keep in mind that there’s no perfect solution that works for everyone. From moisturizers to medicine, finding out what’s best for you may take some trial and error, and it can change over time.");
            lbl_prevent.setText("Can Eczema Be Prevented?");
        }
        else if(recognitionkey.equals("4")){
            iv.setImageResource(R.drawable.peel);
            title.setText("Peeling Skin");
            desc.setText("Peeling skin is unintended damage to and loss of the upper layer of your skin (epidermis). Peeling skin may occur because of direct damage to the skin, such as from sunburn or infection. It may also be a sign of an immune system disorder or other disease.");
            causes.setText("Your skin is regularly exposed to environmental elements that can irritate and damage it. These include sun, wind, heat, dryness and excessive humidity. Repeated irritation can lead to skin peeling. In babies born past their due date, it's not unusual for them to experience some painless skin peeling.\n" +
                    "\n" +
                    "Skin peeling can also result from a disease or condition, which may start someplace other than your skin. This type of skin peeling is often accompanied by itching. Conditions that may cause skin peeling include:\n" +
                    "\n" +
                    "Allergic reactions\n" +
                    "Infections, including some types of staph and fungal infections\n" +
                    "Immune system disorders\n" +
                    "Cancer and cancer treatment\n" +
                    "Genetic disease, including a rare skin disorder called acral peeling skin syndrome that causes painless peeling of the top layer of skin");
            lbl_diag.setText("How Is Peeling Diagnosed?");
            diagnosed.setText("PSS is characterized by painless, continual, spontaneous skin peeling (exfoliation) due to a separation of the outermost layer of the epidermis (stratum corneum) from the underlying layers. Other findings may include blistering and/or reddening of the skin (erythema) and itching (pruritus).");
            lbl_treated.setText("How Is Peeling Treated?");
            treated.setText("Try using lukewarm water and a soft washcloth or shower mitt to gently rub the skin on your face and loosen any skin that's flaking. Don't ever peel your skin, especially when it's wet. Applying a topical anti-inflammatory agent, such as aloe vera, could help your skin to heal.");
            prevent.setText("Aloe vera and moisturizer. Share on Pinterest Aloe vera can slow or reduce the skin's peeling process. ...\n" +
                    "Stay hydrated. Moisturizing is essential for the outside of the body and hydration is important for the inside. ...\n" +
                    "Use anti-inflammatories. ...\n" +
                    "Avoid irritation. ...\n" +
                    "Try these home remedies.");
            lbl_prevent.setText("Can Peeling Be Prevented?");
        }


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(SelectedItemActivity.this,ClassifierActivity.class);
        startActivity(intent);
    }
}