package com.example.rbo13.gened;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import models.Subject;

public class MainActivity extends AppCompatActivity {

    List<Subject> subjectList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        subjectList = new ArrayList<>();

        subjectList.add(
                new Subject(
                        "General Psychology\n" +
                                "History of Psychology",
                        "By David B. Baker and Heather Sperry",
                        "Psychology is an exciting field and the history of psychology offers the opportunity to make sense of how it has grown and developed. The history of psychology also provides perspective. Rather than a dry collection of names and dates, the history of psychology tells us about the important intersection of time and place that defines who we are. Consider what happens when you meet someone for the first time. The conversation usually begins with a series of questions such as, “Where did you grow up?” “How long have you lived here?” “Where did you go to school?” The importance of history in defining who we are cannot be understated. Whether you are seeing a physician, talking with a counselor, or applying for a job, everything begins with a history. The same is true for studying the history of psychology; getting a history of the field helps to make sense of where we are and how we got here.\n" +
                                "Precursors to American psychology can be found in philosophy and physiology. Philosophers such as John Locke (1632–1704) and Thomas Reid (1710–1796) promoted empiricism, the idea that all knowledge comes from experience. The work of Locke, Reid, and others emphasized the role of the human observer and the primacy of the senses in defining how the mind comes to acquire knowledge. In American colleges and universities in the early 1800s, these principles were taught as courses on mental and moral philosophy. Most often these courses taught about the mind based on the faculties of intellect, will, and the senses (Fuchs, 2000).\n" +
                                "German physiologist Hermann von Helmholtz (1821–1894) measured the speed of the neural impulse and explored the physiology of hearing and vision.\n" +
                                "The formal development of modern psychology is usually credited to the work of German physician, physiologist, and philosopher Wilhelm Wundt (1832–1920). Wundt helped to establish the field of experimental psychology by serving as a strong promoter of the idea that psychology could be an experimental field and by providing classes, textbooks, and a laboratory for training students. In 1875, he joined the faculty at the University of Leipzig and quickly began to make plans for the creation of a program of experimental psychology. In 1879, he complemented his lectures on experimental psychology with a laboratory experience: an event that has served as the popular date for the establishment of the science of psychology.\n" +
                                "William James (1842–1910) is regarded as writing perhaps the most influential and important book in the field of psychology, Principles of Psychology,published in 1890. Opposed to the reductionist ideas of Titchener, James proposed that consciousness is ongoing and continuous; it cannot be isolated and reduced to elements. For James, consciousness helped us adapt to our environment in such ways as allowing us to make choices and have personal responsibility over those choices.\n" +
                                "Growth and expansion have been a constant in American psychology. In the latter part of the 20th century, areas such as social, developmental, and personality psychology made major contributions to our understanding of what it means to be human. Today neuroscience is enjoying tremendous interest and growth.\n" +
                                "As mentioned at the beginning of the module, it is a challenge to cover all the history of psychology in such a short space. Errors of omission and commission are likely in such a selective review. The history of psychology helps to set a stage upon which the story of psychology can be told. This brief summary provides some glimpse into the depth and rich content offered by the history of psychology. The learning modules in the Noba psychology collection are all elaborations on the foundation created by our shared past. It is hoped that you will be able to see these connections and have a greater understanding and appreciation for both the unity and diversity of the field of psychology.",
                        "",
                        R.drawable.book
                )
        );

        subjectList.add(
                new Subject(
                        "Ethics in IT\n" +
                                "Ethical Guidance for IT Professionals",
                        "Author: Melissa Woo",
                        "A number of resources help IT professionals searching for ethical guidance within the scope of their job duties. For example, IEEE has a code of ethics for its members; the Association of Information Technology Professionals (AITP) has a code of ethics and standards of conduct; and SANS has published an IT code of ethics. There are other examples beyond these three, and many elements in these codes could be useful to higher education IT professionals. For example, among other elements that describe ethical behavior in the profession, in general these codes assert that IT professionals need to commit to:\n" +
                                "\t•\tIntegrity\n" +
                                "\t•\tCompetence\n" +
                                "\t•\tProfessional responsibilities\n" +
                                "\t•\tWork responsibilities\n" +
                                "\t•\tSocietal responsibilities\n" +
                                "Specific guidance stems from these general principles. Some common commitments between the three codes are to:\n" +
                                "\t•\tMaintain technical competence\n" +
                                "\t•\tAvoid injury to others, their property, reputation, or employment\n" +
                                "\t•\tReject bribes, kickbacks, etc.\n" +
                                "There are interesting, though subtle, differences between the documents that may be related to the specific character and mission of the organizations that developed the different codes. For example, both SANS and IEEE include a commitment to honesty about the limits of one’s capabilities, as well as a commitment to nondiscrimination. On the other hand, both AITP and IEEE state specific commitments to acknowledging a professional’s responsibility to society. Given IEEE’s stated mission to “foster technological innovation and excellence for the benefit to humanity,” it’s not surprising that its code specifically calls out a commitment to understanding the potential consequences of the application of technology.\n" +
                                "With regard to the questions initially asked in this article, both the SANS IT code of ethics and AITP’s Standards of Conduct would seem to cover the situations involving email and a user’s laptop. Guidance from SANS indicates that an IT professional “... will not peruse or examine [a coworker’s] information… except as defined by the appointed roles.”",
                        "https://er.educause.edu/articles/2017/3/ethics-and-the-it-professional",
                        R.drawable.book
                )
        );

        subjectList.add(
                new Subject(
                        "Statistics",
                        "Siddharth Kalla",
                        "Statistics is a branch of mathematics dealing with data collection, organization, analysis, interpretation and presentation.In applying statistics to, for example, a scientific, industrial, or social problem, it is conventional to begin with a statistical population or a statistical model process to be studied. Populations can be diverse topics such as \"all people living in a country\" or \"every atom composing a crystal\". Statistics deals with all aspects of data including the planning of data collection in terms of the design of surveys and experiments.\n" +
                                "When census data cannot be collected, statisticians collect data by developing specific experiment designs and survey samples. Representative sampling assures that inferences and conclusions can reasonably extend from the sample to the population as a whole. An experimental study involves taking measurements of the system under study, manipulating the system, and then taking additional measurements using the same procedure to determine if the manipulation has modified the values of the measurements. In contrast, an observational study does not involve experimental manipulation.\n" +
                                "Two fundamental ideas in the field of statistics are uncertainty and variation. There are many situations that we encounter in science (or more generally in life) in which the outcome is uncertain. In some cases the uncertainty is because the outcome in question is not determined yet (e.g., we may not know whether it will rain tomorrow) while in other cases the uncertainty is because although the outcome has been determined already we are not aware of it (e.g., we may not know whether we passed a particular exam).\n" +
                                "Probability is a mathematical language used to discuss uncertain events and probability plays a key role in statistics. Any measurement or data collection effort is subject to a number of sources of variation. By this we mean that if the same measurement were repeated, then the answer would likely change. Statisticians attempt to understand and control (where possible) the sources of variation in any situation.\n" +
                                "Statistics can be applied to various different problems and situations but the underlying concepts all remain the same. Thus it is important to understand what statistics is, not only from an application point of view but also from an interpretation point of view. This is required because of the diverse applications of statistics, from social science experiments to studying quantum mechanical phenomena.\n" +
                                "Statistics can be broadly classified into descriptive statistics and inferential statistics.\n" +
                                "To understand statistics, one needs to study and understand the probability theory. These are closely connected and inseparable in most cases. In fact, historically, the foundations of statistics were laid with the development of probability theory.\n" +
                                "\n" +
                                "The ideas of presenting data and drawing relevant inferences are central to the successful use of statistical theory. In the end, the statistical analysis should be able to tell us something concrete about the sample that we are studying. A number of errorsare possible in the interpretation of statistical results and a careful analysis needs to be made to prevent these errors.\n" +
                                "In some rare cases, statistics can be used to draw conclusions that appear to be statistically relevant but on careful examination, are not. When such practices are intentional, they can be hard to detect. One good example of such statistical misconduct is data dredging. Therefore one should also be able to spot the scope and relevance of a statistical study and understand it in the context of the study within which it was intended.",
                        "https://www.stat.uci.edu/what-is-statistics/",
                        R.drawable.book
                )
        );

        subjectList.add(
                new Subject(
                        "Philosophy of Man",
                        "Author: Prof. M. Saeed Sheikh",
                        "“Man” seems to have been quite a neglected subject in the history of Western philosophy; more attention has been paid to God and universe than to man. Though there are many reputable histories of the specific branches of philosophy; and even of some of its special subjects such as logic ethics, aesthetics, politics, law and history, a “history of the philosophy of man” has yet to be written and even vet to be conceived. True “man” has sometimes been discussed as a part of this or that theory or system in ethics, politics or education, but such subsidiary discussions by their very nature remain controlled by the requirements and presuppositions of a particular theory or system.\n" +
                                "All this strikes rather ironical in view of the fact that, to the great Socrates; first of the founders of Western philosophy, the central theme of philosophy was not the world, but man. Socrates’ deep concern for the well-being of man makes him look like a prophet moving amongst the Greeks. In the celebrated Platonic Dialogue; the Apology, Socrates is reported to have gone to God, only to be graced with a special message for his fellow men. This Divine message exhorted the Athenians to “ take the greatest possible care of their souls and not to ruin their lives by letting the care of the body and of the “possessions” take precedence over the good of the soul. Nay, they must make their souls as good as possible, making them like God”.\n" +
                                "Socrates is, however, better known to us for his detailed and meticulous analyses of the moral qualities of man; such as justice, goodness, courage, temperance and so on. But what is more important for us to note here is the woeful fact that nowhere in ‘all the twenty-eight platonic Dialogues.\n" +
                                "The definition of man as a rational animal not only carries the formidable authority of Aristotle but also the weight of a long tradition running throughout the ages. This definition of man, to my mind, is more prescriptive than descriptive. It exhorts man to think rationally rather than describe the fact of man’s actually thinking rationally. But it is an imperative or a command, and a good command indeed but for that very reason not a definition. It may be insisted that Aristotle, in his definition has made an empirical statement of the kind that man by virtue of the quality of rationality (differentia) inherent in him, always thinks rationally. In that case this definition is not satisfactory, because it is an incomplete definition which has taken “rationality” as the sole distinctive quality of man as it differentiates him from the animals. There are, however, other similar unique qualities of man differentiating him from the animals, which have been completely by-passed in Aristotle's definition--qualities, for example, of artistic imagination and numinous sense of the presence of the Divine to all things. Aristotle’s- definition could give us only a fragmented man as if a featherless biped.\n" +
                                "It is generally narrated that somewhere in early November, 1933, on way back from Afghanistan Iqbal told Syed Sulaiman Nadvi that the Sufi referred to in the above statement was no other than his own father. The very fact that the name of the author of the statement “popped up” signifies that the statement must have struck the Syed extraordinary. More notable, however, is the fact that the great Syed accepted Iqbal’s assertion as it was and did not comment on it nor added anything to it - not even later. He did not say, for example: “I am so pleased to know this”. But my dear friend, it is nothing very original, it may as well be found in Ghazali, Rumi, Ibn Arabi, Jili, Mujaddid Alit Thani, or any name like them. It looks rather odd that the Iqbal scholars have quietly agreed to foist such an important and methodologically most significant statement on a Sufi, who never had any pretensions whatsoever in the Sufi-lore nor in the subtle and profound ways of the Sufis.\n" +
                                "In the conclusion I would like to say that Philosophy of man is highly disciplined endeavour aimed at the discovery of man in the manifestations of his spirit at its peaks as these are embodied in the celebrated texts of the great prophets, the great poets and the great philosophers which texts are to be re-lived anew in every age through an interpretative method as recommended by philosophers like Dithery and Iqbal.",
                        "http://www.allamaiqbal.com/publications/journals/review/apr88/1.htm",
                        R.drawable.book
                )
        );

        subjectList.add(
                new Subject(
                        "Biology/Biological Science",
                        "",
                        "Biology, also referred to as the biological sciences, is the study of living organisms utilizing the scientific method.\n" +
                                "Biology examines the structure, function, growth, origin, evolution, and distribution of living things.\n" +
                                "It classifies and describes organisms, their functions, how species come into existence, and the interactions they have with each other and with the natural environment.\n" +
                                "Four unifying principles form the foundation of modern biology: cell theory, evolution, genetics and homeostasis.\n" +
                                "Biology as a separate science was developed in the nineteenth century, as scientists discovered that organisms shared fundamental characteristics.\n" +
                                "Biology is now a standard subject of instruction at schools and universities around the world, and over a million papers are published annually in a wide array of biology and medicine journals.\n" +
                                "Most biological sciences are specialized disciplines.\n" +
                                "Traditionally, they are grouped by the type of organism being studied: botany, the study of plants; zoology, the study of animals; and microbiology, the study of microorganisms.\n" +
                                "The fields within biology are further divided based on the scale at which organisms are studied and the methods used to study them: biochemistry examines the fundamental chemistry of life; molecular biology studies the complex interactions of systems of biological molecules; cellular biology examines the basic building block of all life, the cell; physiology examines the physical and chemical functions of the tissues and organ systems of an organism; and ecology examines how various organisms interrelate.\n" +
                                "Applied fields of biology such as medicine and genetic research involve many specialized sub-disciplines.\n" +
                                "A central organizing concept in biology is that life changes and develops through evolution and that all lifeforms known have a common origin.\n" +
                                "Charles Darwin established evolution as a viable theory by articulating its driving force, natural selection (Alfred Russel Wallace is recognized as the co-discoverer of this concept).\n" +
                                "Darwin theorized that species and breeds developed through the processes of natural selection as well as by artificial selection or selective breeding.\n" +
                                "Genetic drift was embraced as an additional mechanism of evolutionary development in the modern synthesis of the theory.\n" +
                                "Biological form and function is created from and is passed on to the next generation by genes, which are the primary units of inheritance.\n" +
                                "Physiological adaption to an organism's environment cannot be coded into its genes and cannot be inherited by its offspring.\n" +
                                "Remarkably, widely different organisms, including bacteria, plants, animals, and fungi, all share the same basic machinery that copies and transcribes DNA into proteins.\n" +
                                "For example, bacteria with inserted human DNA will correctly yield the corresponding human protein.",
                        "https://www.sciencedaily.com/terms/biology.htm",
                        R.drawable.book
                )
        );

        subjectList.add(
                new Subject(
                        "Earth and Life Science",
                        "",
                        "Earth Science\n" +
                                "\n" +
                                "Earth science or geoscience includes all fields of natural science related to the planet Earth. It is the branch of science dealing with the physical constitution of the earth and its atmosphere. Earth science is the study of our planet’s physical characteristics, from earthquakes to raindrops, and floods to fossils. Earth science can be considered to be a branch of planetary science, but with a much older history. “Earth science” encompasses four main branches of study, the lithosphere, the hydrosphere, the atmosphere, and the biosphere, each of which is further broken down into more specialized fields.\n" +
                                "\n" +
                                "Branches of Earth science\n" +
                                "\t•\tAtmospheric science\n" +
                                "\t•\tEnvironmental science\n" +
                                "\t•\tGeology\n" +
                                "\t•\tGeography\n" +
                                "\t•\tGeoinformatics\n" +
                                "\t•\tOceanography\n" +
                                "\t•\tPlanetary science\n" +
                                "\t•\tSoil science",
                        "https://en.wikipedia.org/wiki/Earth_science",
                        R.drawable.book
                )
        );

        subjectList.add(
                new Subject(
                        "Life Science",
                        "",
                        "The branches of science that study living things are referred to as the life sciences. A scientist who works in the life sciences would be interested in learning more about plants, animals, human beings or even tiny microscopic organisms. Biology is the foundation of the life sciences.\n" +
                                "\n" +
                                "Branches of Earth science\n" +
                                "\t•\tBiology\n" +
                                "\t•\tBotany\n" +
                                "\t•\tZoology\n" +
                                "\t•\tEcology\n" +
                                "\t•\tGenetics\n" +
                                "\t•\tMedicine",
                        "https://study.com/academy/lesson/what-are-life-sciences.html#/lesson",
                        R.drawable.book
                )
        );

        subjectList.add(
                new Subject(
                        "Philippine History",
                        "",
                        "Pamumuno ng Espanya (1521 - 1898)\n" +
                                "\n" +
                                "Ang Pilipinas ay unang natuklas ni Ferdinand Magellan noong ika-16 ng Marso 1521.\n" +
                                "\n" +
                                "Unang nakarating ang mga Europeo sa Pilipinas sa pagdating ng expedisyon ng mga Español na pinamunuan ng Portuges na si Ferdinand Magellan noong 16 Marso 1521. Pumalaot si Magallanes sa pulo ng Cebu, inangkin ito para sa Espanya, at binigyan ito ng pangalan na Islas de San Lazaro \n" +
                                "\n" +
                                "Ngunit, napatay si Ferdinand Magellan ng pangkat ni Lapu-Lapu, na tumutol sa pamamahala ng Espanya.\n" +
                                "\n" +
                                "Ang permanenteng paninirahan ay naitatag lamang noong 1565 nang makarating ang ekspedisyon na pinamunuan ni Miguel Lopez de Legazpi sa Cebu mula sa Mexico. Ang pamumuno ng mga Espanyol ay naitatag sa mga maliliit na malayang pamayanan na walang alam sa pamahalaang sentralisado.[4] Matapos ang anim na taon, nang matalo ang isang Muslim na datu, itinatag ni Legazpi ang isang lungsod sa Maynila, na nagbigay ng pangunahing daungan sa Look ng Maynila, isang malaking populasyon at malapit sa mga kapatagan ng Gitnang Luzon.[5] Naging sentro ng pamahalaang kolonyal ang Maynila, pati na rin ang aktibidad na pang-militar, panrelihiyon at pangkalakalan\n" +
                                "\n" +
                                "Nagsimula ang rebolusyon noong 1896. Napagkamalan si Rizal na siya ang nagpasimula ng rebolusyon na naging sanhi ng kanyang pagkamatay noong 30 Disyembre 1896. Ang Katipunan sa Cavite ay nahati sa dalawa, ang Magdiwang na pinamunuan ni Mariano Alvarez (kamag-anak ni Bonifacio sa pamamagitan ng kasal), at ang Magdalo, na pinamunuan ni Emilio Aguinaldo. Ang alitan sa pagitan ni Bonifacio at Aguinaldo ang nagdulot sa pagpatay kay Bonifacio ng mga sundalo ni Aguinaldo noong 10 Mayo 1897. Sumang-ayon si Aguinaldo sa mga kondisyon ng Kasunduan sa Biak-na-Bato at siya at ang kanyang mga kasamang rebolusonaryo ay ipinatapon sa Hong Kong.\n" +
                                "\n" +
                                "Panahong kolonyal ng Amerikano (1521 - 1898)\n" +
                                "\n" +
                                "Nagsimula ang relasyon ng Pilipinas sa Estados Unidos nang magsama ang dalawang bansa upang labanan ang mga Kastila. Bilang mga magka-alyado, binigyan ng mga sundalong Pilipino ang mga Amerikano ng mga mahahalagang impormasyon at suporta mula sa militar. Ngunit, dumistansiya ang Estados Unidos sa mga hangarin ng mga Pilipino. Hindi natuwa si Aguinaldo nang tumutol ang mga Amerikano na suportahan ang kalayaan ng Pilipinas. Nagwakas ang relasyon ng dalawang bansa at tumaas ang tensiyon nang naging malinaw ang pakay ng mga Amerikanong manatili sa mga pulo.\n" +
                                "\n" +
                                "Sumiklab ang Digmaang Pilipino-Amerikano noong Pebrero, 1899, matapos patayin ng dalawang Amerikanong sundalo ang tatlong Pilipinong sundalo sa San Juan. Naging mas magastos at mas marami ang namatay sa digmaang ito kaysa sa Digmaang Espanyol-Amerikano. Humigit-kumulang 126,000 Amerikanong sundalo ang lumaban sa digmaan; 4,234 Amerikano ang namatay, pati na rin ang 16,000 Pilipinong sundalo na naging kasali sa isang pambansang gerilyangkampanya na walang tiyak na bilang ng mga kasapi. Sa pagitan ng 250,000 at 1,000,000 sibilyan ang namatay dahil sa kagutuman at sakit. Pinahirapan nila ang isa't isa. \n" +
                                "\n" +
                                "Pananakop ng mga Hapones sa Pilipinas (1941 - 1945)\n" +
                                "\n" +
                                "Naglunsad ang bansang Hapon ng isang sorpresang pag-atake sa Clark Air Base sa Pampanga noong 8 Disyembre 1941, halos sampung oras lamang matapos ang Pag-atake sa Pearl Harbor. Ang pagbobomba sa pamamagitan ng paggamit ng mga eroplano ay sinundan ng pagdating ng mga sundalong Hapones sa Luzon. Ang hukbo ng mga Pilipino at Amerikanong sundalo ay pinamunuan ni Heneral Douglas MacArthur. Dahil sa pagdami ng mga kalabang dumarating sa bansa, lumikas ang mga hukbong Pilipino at Amerikano sa Bataan at sa pulo ng Corregidor. Ang Maynila, na idineklarang bukas na lungsod/Open City upang maiwasan ang pagkawasak nito, ngunit naging pasaway ang mga hapones at sinalakay pa rin ito ito ay pinasok ng mga Hapones noong 2 Enero 1942. Nagpatuloy ang pagtatanggol ng mga Pilipino hanggang sa pagsuko ng mga sundalong Pilipino at Amerikano sa Bataan noong 9 Abril 1942 at ang Corregidor noong Mayo 6. Karamihan sa 80,000 na mga preso ng digmaan na nahuli ng mga Hapones sa Bataan ay sapilitang pinagmartsa patungo sa isang kulungang may layo ng 105 kilometro sa Hilaga (Pampangga) . Tinatayang 10,000 mga Pilipino, 300 mga Pilipinong Intsik at 1,200 mga Amerikano ang namatay bago makarating sa destinasyon.\n" +
                                "\n" +
                                "Kasama ni Pangulong Manuel L. Quezon sa Estados Unidos si Sergio Osmena. Namatay si Quezon sa sakit na tuberkulosis noong 1 Agosto 1944 at si Osmeña ang humalili sa kanya. Kasama siya ng mga puwersang Amerikanong lumunsad sa Leyte. Samantala maraming ang magkakasanib ng mga sundalong Pilipino at Amerikano kasama ng mga kumilalang gerilya ay ipagtatanggol ng sagupaan ng pakipaglaban sa mga Hapones ay simula ng kampanya ng labanan ng pagpapalaya sa Pilipinas. Nagsilbi siya bilang pangulo ng bansa hanggang sa magkaroon ng halalan noong 23 Abril 1946. Paghahanda ito sa pagbibigay ng kalayaan ng Estados Unidos. Kumandidato siya bilang pangulo, ngunit natalo kay Manuel Roxas.\n" +
                                "\n" +
                                "Mga naging pangulo ng Republika ng Pilipinas (butangan ug pictures sa mga presidents)\n" +
                                "\n" +
                                "\t•\tEmilio Aguinaldo (1899 - 1901)\n" +
                                "\t•\tManuel L. Quezon (1935 - 1944)\n" +
                                "\t•\tJose P. Laurel (1943 - 1945)\n" +
                                "\t•\tSergio Osmeña (1944 - 1946)\n" +
                                "\t•\tManuel Roxas (1946 - 1948)\n" +
                                "\t•\tElpidio Quirino (1948 - 1953)\n" +
                                "\t•\tRamon Magsaysay (1953 - 1957)\n" +
                                "\t•\tCarlos P. Garcia (1957 - 1961)\n" +
                                "\t•\tDiosdado Macapagal (1961 - 1965)\n" +
                                "\t•\tFerdinand E. Marcos (1965 - 1986)\n" +
                                "\t•\tCorazon C. Aquino (1986 - 1992)\n" +
                                "\t•\tFidel V. Ramos (1992 - 1998)\n" +
                                "\t•\tJoseph Ejercito Estrada (1998 - 2001)\n" +
                                "\t•\tGloria Macapagal Arroyo (2001 - 2010)\n" +
                                "\t•\tBenigno S. Aquino III (2010 - 2016)\n" +
                                "\t•\tRodrigo R. Duterte (2016 - Kasalukuyan)",
                        "https://tl.wikipedia.org/wiki/Kasaysayan_ng_Pilipinas",
                        R.drawable.book
                )
        );

        subjectList.add(
                new Subject(
                        "Philippine TRAIN Law",
                        "",
                        "THE TAX REFORM FOR ACCELERATION AND INCLUSION (TRAIN) ACT.\n" +
                                "President Rodrigo Roa Duterte signed into law Republic Act No. 10963, otherwise known as the Tax Reform for Acceleration and Inclusion (TRAIN) Act, the first package of the Comprehensive Tax Reform Program (CTRP, on December 19, 2017 in Malacanang.\n" +
                                "The TRAIN will provide hefty income tax cuts for majority of Filipino taxpayers while raising additional funds to help support the government’s accelerated spending on its “Build, Build, Build” and social services programs.\n" +
                                "This tax reform package corrects a longstanding inequity of the tax system by reducing personal income taxes for 99 percent of taxpayers, thereby giving them the much needed relief after 20 years of non-adjustment of the tax rates and brackets. This is the biggest Christmas and New Year gift the government is giving to the people.\n" +
                                "For the poorest 10 million households, the government is giving them targeted cash transfers of PHP 200 per month in 2018 and P300 per month in 2019 and 2020, sourced from higher consumption taxes that the rich will contribute, as well as better social services, healthcare, and education. All these will prepare the people for better job opportunities.\n" +
                                "In a separate message, President Duterte has vetoed certain provisions of the TRAIN. The vetoed five line items are the following provisions:\n" +
                                "1. Reduced income tax rate of employees of Regional Headquarters (RHQs), Regional Operating Headquarters (ROHQs), Offshore Banking Units (OBUs), and Petroleum Service Contractors and Subcontractors;\n" +
                                "2. Zero-rating of sales of goods and services to separate customs territory and tourism enterprise zones;\n" +
                                "3. Exemption from percentage tax of gross sales/receipts not exceeding five hundred thousand pesos (P500,000.00);\n" +
                                "4. Exemption of various petroleum products from excise tax when used as input, feedstock, or as raw material in the manufacturing of petrochemical products, or in the refining of petroleum products, or as replacement fuel for natural gas fired combined cycle power plants; and\n" +
                                "5. Earmarking of incremental tobacco taxes.\n" +
                                "The TRAIN raises significant revenues to support the President’s priority social and infrastructure programs, which will help realize his administration’s goal of reducing the poverty rate from 21.6 to 14 percent by 2022. Some 70 percent of the incremental revenues will help fund the government’s infrastructure modernization program, while the balance will go to social services.\n" +
                                "Starting 2018, the government expects to raise funds equivalent to about two-thirds of the incremental revenues targeted under this tax reform law. The Congress has committed to pass the rest of the TRAIN’s provisions representing the remaining one-third of the targeted revenues in early 2018 to help us achieve our revenue and deficit targets.\n" +
                                "With the people’s support and understanding, all these reforms will result in more and better jobs, lower prices, and a brighter future for every Filipino.",
                        "https://www.dof.gov.ph/index.php/ra-10963-train-law-and-veto-message-of-the-president/",
                        R.drawable.book
                )
        );

        subjectList.add(
                new Subject(
                        "Life and Works of Rizal",
                        "",
                        "Si Dr. José Protacio Rizal Mercado y Alonzo Realonda (19 Hunyo 1861– 30 Disyembre 1896) ay isang Pilipinong bayani at isa sa pinakatanyag na tagapagtaguyod ng pagbabago sa Pilipinas noong panahon ng pananakop ng mga Kastila. Siya ang kinikilala bilang pinakamagaling na bayani at tinala bilang isa sa mga pambansang bayani ng Pilipinas ng Lupon ng mga Pambansang Bayani\n" +
                                "Pinanganak si Rizal sa isang mayamang angkan sa Calamba, Laguna at pampito sa labing-isang anak ng mag-asawang Francisco Engracio Rizal Mercado y Alejandro at Teodora Morales Alonzo Realonda y Quintos. Nag-aral siya sa Ateneo Municipal de Manila, at nakakuha ng diploma sa Batsilyer ng Sining at nag-aral ng medisina sa Pamantasan ng Santo Tomas sa Maynila. Ipinagpatuloy niya ang kanyang pag-aaral sa Universidad Central de Madrid sa Madrid, Espanya, at nakakuha ng Lisensiya sa Medisina, na nagbigay sa kanyan ng karapatan sanayin ang medisina. Nag-aral din siya sa Pamantasan ng Parisat Pamantasan ng Heidelberg.\n" +
                                "Ang kanyang dalawang nobela “Noli Me Tangere” at “El Filibusterismo.” naglalahad ng mga pang-aabuso ng mga prayle sa mga Pilipino at mga katiwalian sa pamahalaan ng Kastila.\n" +
                                "Itinatag ni José Rizal ang La Liga Filipina, isang samahan na naging daan sa pagkabuo ng Katipunan na pinamunuan ni Andrés Bonifacio,[note 4], isang lihim na samahan na nagpasimula ng Himagsikang Pilipino laban sa Espanya na naging saligan ng Unang Republika ng Pilipinas sa ilalim ni Emilio Aguinaldo. Siya ay tagapagtaguyod ng pagkakaroon ng Pilipinas ng sarili nitong pamahalaan sa mayapang pamamaraan kaysa sa marahas na himagsikan, at susuportahan lamang ang karahasan bilang huling dulugan.[7] Naniniwala si Rizal na ang tanging katwiran sa pagpapalaya sa Pilipinas at pagkakaroon nito ng sariling pamahalaan ay ang pagbabalik ng karangalan ng mga mamamayan,[note 5] at kanyang winika \"Bakit kalayaan, kung ang mga alipin ngayon ay magiging maniniil ng hinaharap?\"[8] Ang pangkahalatang napagsang-ayunan ng mga dalubhasa sa buhay ni Rizal ay ang pagbitay dito ang naghudyat upang magsimula ang Himagsikang Pilipino.\n" +
                                "Noong Setyembre 3, 1896 habang papunta siya sa Cuba upang magsilbi bilang siruhano at inaresto siya. Noong Nobyembre 3, 1896 ibinalik sa Pilipinas at sa pangalawang pagkakataon nakulong siya sa Fort Santiago.\n" +
                                "Noong Disyembre 26, 1896 si Dr. Jose Rizal ay nahatulan ng kamatayan sa dahilang nagpagbintangan siya na nagpasimula ng rebelyon laban sa mga Kastila.\n" +
                                "Bago dumating ang kanyang katapusan naisulat niya ang “Mi Ultimo Adios” (Ang Huling Paalam) upang magmulat sa mga susunod pang henerasyon na maging makabayan.\n" +
                                "Noong Disyembre 30, 1896, binaril si Dr. Jose P. Rizal sa Bagumbayan (na ngayon ay Luneta).",
                        "https://www.joserizal.com/talambuhay-ni-dr-jose-rizal/",
                        R.drawable.jose_rizal
                )
        );

        subjectList.add(
                new Subject(
                        "Arts",
                        "",
                        "Art is a diverse range of human activities in creating visual, auditory or performing artifacts (artworks), expressing the author's imaginative, conceptual idea, or technical skill, intended to be appreciated for their beauty or emotional power. In their most general form these activities include the production of works of art, the criticism of art, the study of the history of art, and the aesthetic dissemination of art.\n" +
                                "The three classical branches of art are painting, sculpture and architecture. Music, theatre, film, dance, and other performing arts, as well as literature and other media such as interactive media, are included in a broader definition of the arts. Until the 17th century, art referred to any skill or mastery and was not differentiated from crafts or sciences. In modern usage after the 17th century, where aesthetic considerations are paramount, the fine arts are separated and distinguished from acquired skills in general, such as the decorative or applied arts.\n" +
                                "Though the definition of what constitutes art is disputed and has changed over time, general descriptions mention an idea of imaginative or technical skill stemming from human agency and creation. The nature of art and related concepts, such as creativity and interpretation, are explored in a branch of philosophy known as aesthetics\n" +
                                "\n" +
                                "3 Types of Arts\n" +
                                "\t•\tRepresentational Art - is the artwork that represents something, which means the content has an identity.\n" +
                                "\t•\tAbstract Art - is art that does not attempt to represent an accurate depiction of a visual reality but instead use shapes, colours, forms and gestural marks to achieve its effect. \n" +
                                "\t•\tNon – Objective Art - is a type of abstract or non-representational art. It tends to be geometric and does not represent specific objects, people, or other subjects found in the natural world.\n" +
                                "\n" +
                                "The oldest documented forms of art are visual arts, which include creation of images or objects in fields including today painting, sculpture, printmaking, photography, and other visual media. Sculptures, cave paintings, rock paintings and petroglyphs from the Upper Paleolithic dating to roughly 40,000 years ago have been found, but the precise meaning of such art is often disputed because so little is known about the cultures that produced them. The oldest art objects in the world—a series of tiny, drilled snail shells about 75,000 years old—were discovered in a South African cave. Containers that may have been used to hold paints have been found dating as far back as 100,000 years. Etched shells by Homo erectus from 430,000 and 540,000 years ago were discovered in 2014.\n" +
                                "In The Origin of the Work of Art, Martin Heidegger, a German philosopher and a seminal thinker, describes the essence of art in terms of the concepts of being and truth. He argues that art is not only a way of expressing the element of truth in a culture, but the means of creating it and providing a springboard from which \"that which is\" can be revealed. Works of art are not merely representations of the way things are, but actually produce a community's shared understanding. Each time a new artwork is added to any culture, the meaning of what it is to exist is inherently changed.",
                        "https://www.sciencedaily.com/terms/biology.htm",
                        R.drawable.book
                )
        );

        subjectList.add(
                new Subject(
                        "Project Management in IT",
                        "",
                        "IT project management involves a structured approach to planning, organizing, leading, and controlling information technology projects. There are various types of IT projects that an organization could undertake, including:\n" +
                                "• Software development and implementation\n" +
                                "• Hardware installations (e.g., servers, desktop computers, or telephony systems)\n" +
                                "• Network system upgrades\n" +
                                "• Data management\n" +
                                "\n" +
                                "Project Life Cycle\n" +
                                "For any IT project, the project will have a start point and an end point, and the part in between is known as the project life cycle. There are generally five phases for all projects.\n" +
                                "To illustrate these phases in the management of an IT project, let's look at a company that is replacing all sales force laptops with tablets.\n" +
                                "1) Initiation - A sponsor and a governing team (sometimes called a steering committee) are appointed, and they clearly define the goals and objectives for the project. A project manager is assigned to the project, a project team is recruited, and the project charter is created.\n" +
                                "For the project in our example, the sponsor could be the Head of IT, and the steering committee could consist of the Head of IT, the Procurement Manager, and the Head of Sales. The objectives of the project could be to replace all sales force laptops with tablets by June 30, 2016, and to do so within a total budget of $20,000.\n" +
                                "2) Planning - The project manager and the project team work together to define all the deliverables, or intended outputs, of the project, and then plan all of the tasks needed in order to produce each deliverable. Each task is assigned a start date, end date, and responsible person(s), and all of the tasks together roll up into the project plan. The project planning processes can be repetitive in nature, and it's quite normal for planning to occur often throughout the project.\n" +
                                "For the project in our example, deliverables of the project could be the specification for the tablets to be sourced; the Request for Proposal documents to go out to suppliers; and the tablets, training plan, and training manuals to be used to teach the sales force how to work with their new tablets. The project plan would then be constructed by listing all the tasks required to produce each of these deliverables, and each of the tasks would be assigned a duration, start date, and end date.\n" +
                                "3) Execution - The project team executes the project plan to create the deliverables of the project.\n" +
                                "For the project in our example, the team would begin working on all the tasks listed on the project plan. For instance, regarding the specification deliverable for tablets to be sourced, the team would begin gathering the requirements for the tablets, then drafting the specification, then reviewing the specification, and finally approving the specification.\n" +
                                "4) Monitoring and Controlling - As the project is being executed by the project team, the project manager monitors and controls the work of the team for time, cost, scope, quality, risk, and other factors. The project manager regularly reports the project status, as well as any issues and risks, to the project sponsor and steering committee. To ensure that the project meets its objectives, monitoring and controlling is also an ongoing process.\n" +
                                "For the project in our example, the project manager would schedule meetings every week or every two weeks with the project's steering committee to update them on the project status, project budget, and any major issues and risks. For example, if the supplier appointed to supply the tablets suddenly went out of business, this would pose a major risk to the project, and the project manager would need to report this to the steering committee immediately so that they could issue a directive.\n" +
                                "5) Closing - At the end of each phase of the project, and at the end of the entire project, project closure ensures that all of the project work has been completed, is approved, and that ownership of the project deliverables have been handed over from the project team to operations.",
                        "https://study.com/academy/lesson/what-is-it-project-management-definition-tools-examples.html",
                        R.drawable.book
                )
        );

        subjectList.add(
                new Subject(
                        "Human Computer Interaction",
                        "",
                        "Human-Computer Interaction (HCI) is a multidisciplinary field of study focusing on the design of computer technology and, in particular, the interaction between humans (the users) and computers. While initially concerned with computers, HCI has since expanded to cover almost all forms of information technology design.\n" +
                                "HCI surfaced in the 1980s with the advent of personal computing, just as machines such as the Apple Macintosh, IBM PC 5150 and Commodore 64 started turning up in homes and offices in society-changing numbers. For the first time, sophisticated electronic systems were available to general consumers for uses such as word processors, games units and accounting aids. Consequently, as computers were no longer room-sized, expensive tools exclusively built for experts in specialized environments, the need to create human-computer interaction that was also easy and efficient for less experienced users became increasingly vital. From its origins, HCI would expand to incorporate multiple disciplines, such as computer science, cognitive science and human-factors engineering.\n" +
                                "The challenge of personal computing became manifest at an opportune time. The broad project of cognitive science, which incorporated cognitive psychology, artificial intelligence, linguistics, cognitive anthropology, and the philosophy of mind, had formed at the end of the 1970s. Part of the programme of cognitive science was to articulate systematic and scientifically informed applications to be known as \"cognitive engineering\". Thus, at just the point when personal computing presented the practical need for HCI, cognitive science presented people, concepts, skills, and a vision for addressing such needs through an ambitious synthesis of science and engineering. HCI was one of the first examples of cognitive engineering.\n" +
                                "Other historically fortuitous developments contributed to the establishment of HCI. Software engineering, mired in unmanageable software complexity in the 1970s (the “software crisis”), was starting to focus on nonfunctional requirements, including usability and maintainability, and on empirical software development processes that relied heavily on iterative prototyping and empirical testing. Computer graphics and information retrieval had emerged in the 1970s, and rapidly came to recognize that interactive systems were the key to progressing beyond early achievements. All these threads of development in computer science pointed to the same conclusion: The way forward for computing entailed understanding and better empowering users. These diverse forces of need and opportunity converged around 1980, focusing a huge burst of human energy, and creating a highly visible interdisciplinary project.\n" +
                                "Software engineering focuses on the production of software application solutions, whereas HCI focuses on discovering methods and techniques that support people. HCI designers always consider HCI usability and user experience goals for effective user interaction. Not all usability and user experience goals apply to every interactive computer system because certain combinations are incompatible. HCI designers also consider potential contexts, tasks at hand and computer system users.\n" +
                                "Usability and user experience goal awareness is essential to all HCI design, as follows:\n" +
                                "\t•\tUsability: Central to interaction design and operations through specific computer system criteria, including efficiency, safety, utility and learning/retention.\n" +
                                "\t•\tUser Experience: Focuses on creating systems that are satisfying, enjoyable, entertaining, helpful, motivating, aesthetically pleasing, creativity supportive, rewarding, fun and emotionally fulfilling.",
                        "https://www.sciencedaily.com/terms/biology.htm",
                        R.drawable.book
                )
        );

        //creating recyclerview adapter
        SubjectsAdapter adapter = new SubjectsAdapter(this, subjectList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}
