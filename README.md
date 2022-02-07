<p align="center">
 <h2 align="center">BMI Calculator Mobile App</h2>
 <p align="center">Projektni zadatak za kolegij Metode i tehnike testiranja programske podrške</p>
</p>
<p align="justified">⚡ BMI Calculator je mobilna aplikacija za izračun indeksa tjelesne mase. Aplikacija svojim jednostavnim sučeljem omogućuje korisniku pristupačan unos podataka, ispis rezultata i usporedbu rezultata s klasifikacijom po BMI indeksu.</p>

<p align="justified">
 <h2 align="left">Demo</h2>

<video src="https://user-images.githubusercontent.com/90279069/152331404-6d680ec7-15df-41ac-a74f-8d2197f4f38f.mp4"></video>


</p>
</p>

<p align="justify">
 <h2 align="left">Usage</h2>
  <h3 align="left">Step 1</h3>
 <p> ➡️ Potrebno je instalirati Android Studio kako biste koristili ovu aplikaciju. Link se nalazi <a href="https://developer.android.com/studio?gclid=CjwKCAiAl-6PBhBCEiwAc2GOVEh74aJm77VDUjCeUsDycOlpae2JaVpsY_MF-vJaa2imgXQe7jZrvxoCeQUQAvD_BwE&gclsrc=aw.ds"><b>ovdje</b></a>.</p>
 <h3 align="left">Step 2</h3>
 <p> Skinete (<i>pull</i>) <b>\BMI Calculator - Mobile App</b> datoteku ovoga repozitorija i otvorite ju unutar okruženja Android Studio.</p>
 <h3 align="left">Step 3</h3>
 <p align="justify"> Kada se učitaju i sinkroniziraju svi <i>gradles</i>, pokrenete <i>Run</i> opciju te će vam se aplikacija instalirati na <i>Emulatoru</i> razvojnog okruženja. Možete ju također instalirati i na vlastiti mobitel, ali prije toga morate odobriti napredne programske usluge u postavkama svojega mobitela.</p>
</p>

<p align="justify">
 <h2 align="left">Tests</h2>
 <h3 align="left">1. Katalon Studio - System testing</h3>
 <p align="justify"> 🌱Katalon Studio razvojno je okruženje za testiranje različitog broja programske podrške. Mogu se testirati WEB aplikacije različitih poslužitelja, mobilne aplikacije različitih operacijskih sustava, računalne aplikacije i drugo. Primarno služi sustavnom testiranju, odnosno daje mogućnost snimanja koraka kretnje korisnika po aplikaciji i na taj način stvara testne korake za testni slučaj koji se pokreće.</p>
 <p align="justify"> Prije samog testiranja potrebne su dodatni modulu kako bi se ispravno izvršavali procesi snimanja i korištenja usluga Katalon Studija. Moraju se instalirati NodeJs i Appium server. Katalon će također instalirati potrebne SDK module kako bi se moglo testirati ili na uređaju korisnika ili na <i>Emulatoru</i>. Više o svemu tome možete pogledati <a href = "https://www.youtube.com/watch?v=qsFXyUNiQFg&list=LL&index=16"><b>ovdje</b></a>. </p>
 <p align="justify">
 Ova aplikacija testirana je u Katalon Studiju. Zippana datoteka <b>ProjektFranZamaklarMobileTestSample.7z</b> nalazi se unutar datoteke <b>\Katalon Studio Testing</b> ovog repozitorija i moguće ju je skinuti. Bitno je napomenuti da Katalon Studio povlači sve potrebne stavke za stvaranje testnog projekta s vlastitog repozitorija na GITHubu tako da se unutar ovog projekta također nalazi <i>submodel</i> koji vodi do izvornog koda na repozitoriju Katalon Studija. Prilikom testiranja vlastite aplikacije, ostvaruje se mogućnost snimanja koraka i njihovih spremanja u testni slučaj, no ne i pokretanja/izvršavanja testnog slučaja. Sljedeće je prikazano na slikama. </p>

<p align="center">
<img src="https://user-images.githubusercontent.com/90279069/152341118-a0f09254-8fe2-472d-bdf2-a6dc684f5aa7.png" width=800 height=auto>
 <hr>
 </p>
 <p align="center">
<img src="https://user-images.githubusercontent.com/90279069/152341202-14125bc9-8235-4f17-a27a-000f18da068d.png" width=800 height=auto>
 <hr>
 </p>
 <p align="center">
<img src="https://user-images.githubusercontent.com/90279069/152341222-2137ff33-65da-4cdd-bef9-19abe5724ed0.png" width=800 height=auto>
 </p>
 
<p align="justify">  
 <h3 align="left">2. Android Studio - Unit testing</h3>
 <p align="justify"> ❗️ Osim što je Android razvojno okruženje, ono je i okruženje za testiranje. Primarno se izrađuju takozvani <i>unit</i> testovi, ali mogu se također izraditi i integracijski testovi. Unit testovi pokazuju ispravnost funkcionalnosti određene komponente. To su najčešće metode koje obavljaju nekakav posao.</p>
 <p align="justify"> Za ovo testiranje potrebno je implementirati unutar <build.gradle> modela dodatne ovisnosti (<i>dependencies</i>) kako bi kvaliteno i lakše funkcionirali testovi</p>
 
  ```testImplementation 'junit:junit:4.+'```<br>
 ```testImplementation "com.google.truth:truth:1.1.3"```
                                                                                                                            
<p align="justify">
 Zatim je potrebno otvoriti dolje navedene klase unutar <b>\BMI Calculator - Mobile App</b> u Android Studiju i pokrenuti Unit testove.</p>
 
  ```ConverterUtilTest```<br>
 ```CalculatorUtilTest```

<p align="justify">
 Naposljetku su dana izvješća obavljenih testova u PDF obliku u datoteci <b>\Unit Testing Report</b> koje se može pogledati ili preuzeti na poveznici <b>TestCases-Projekt-Zamaklar-MTTPP.pdf</b></p>
 
 <p align="justify">
 <h2 align="left">About Me</h2>
 <p align="justify"> 👋(2022.) Student diplomskog studija Fakulteta elektrotehnike, računarstva i informacijskih tehnologija Osijek u Osijeku.</p></p>
