
class Country {
      
	  // 1) India (36)
static String IndiaStates[] = {
"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat",
"Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh",
"Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab",
"Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh",
"Uttarakhand","West Bengal",
"Andaman and Nicobar Islands","Chandigarh",
"Dadra and Nagar Haveli and Daman and Diu","Delhi",
"Jammu and Kashmir","Ladakh","Lakshadweep","Puducherry"
};

// 2) United States (50)
static String UnitedStatesStates[] = {
"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut",
"Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa",
"Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan",
"Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada",
"New Hampshire","New Jersey","New Mexico","New York","North Carolina",
"North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island",
"South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont",
"Virginia","Washington","West Virginia","Wisconsin","Wyoming"
};

// 3) Canada (13)
static String CanadaStates[] = {
"Alberta","British Columbia","Manitoba","New Brunswick",
"Newfoundland and Labrador","Nova Scotia","Ontario",
"Prince Edward Island","Quebec","Saskatchewan",
"Northwest Territories","Nunavut","Yukon"
};

// 4) Australia (8)
static String AustraliaStates[] = {
"New South Wales","Victoria","Queensland","Western Australia",
"South Australia","Tasmania","Australian Capital Territory","Northern Territory"
};

// 5) United Kingdom (4)
static String UnitedKingdomStates[] = {
"England","Scotland","Wales","Northern Ireland"
};

// 6) Germany (16)
static String GermanyStates[] = {
"Baden-Württemberg","Bavaria","Berlin","Brandenburg","Bremen","Hamburg",
"Hesse","Lower Saxony","Mecklenburg-Vorpommern","North Rhine-Westphalia",
"Rhineland-Palatinate","Saarland","Saxony","Saxony-Anhalt",
"Schleswig-Holstein","Thuringia"
};

// 7) France (13)
static String FranceStates[] = {
"Auvergne-Rhône-Alpes","Bourgogne-Franche-Comté","Brittany",
"Centre-Val de Loire","Corsica","Grand Est","Hauts-de-France",
"Île-de-France","Normandy","Nouvelle-Aquitaine","Occitanie",
"Pays de la Loire","Provence-Alpes-Côte d’Azur"
};

// 8) Italy (20)
static String ItalyStates[] = {
"Abruzzo","Aosta Valley","Apulia","Basilicata","Calabria","Campania",
"Emilia-Romagna","Friuli Venezia Giulia","Lazio","Liguria",
"Lombardy","Marche","Molise","Piedmont","Sardinia","Sicily",
"Trentino-Alto Adige","Tuscany","Umbria","Veneto"
};

// 9) Japan (47)
static String JapanStates[] = {
"Hokkaido","Aomori","Iwate","Miyagi","Akita","Yamagata","Fukushima",
"Ibaraki","Tochigi","Gunma","Saitama","Chiba","Tokyo","Kanagawa",
"Niigata","Toyama","Ishikawa","Fukui","Yamanashi","Nagano",
"Gifu","Shizuoka","Aichi","Mie","Shiga","Kyoto","Osaka","Hyogo",
"Nara","Wakayama","Tottori","Shimane","Okayama","Hiroshima",
"Yamaguchi","Tokushima","Kagawa","Ehime","Kochi","Fukuoka",
"Saga","Nagasaki","Kumamoto","Oita","Miyazaki","Kagoshima","Okinawa"
};

// 10) China (31)
static String ChinaStates[] = {
"Anhui","Fujian","Gansu","Guangdong","Guizhou","Hainan","Hebei","Heilongjiang",
"Henan","Hubei","Hunan","Jiangsu","Jiangxi","Jilin","Liaoning","Qinghai",
"Shaanxi","Shandong","Shanxi","Sichuan","Yunnan","Zhejiang",
"Guangxi","Inner Mongolia","Ningxia","Tibet","Xinjiang",
"Beijing","Chongqing","Shanghai","Tianjin"
};

// 11) Brazil (27)
static String BrazilStates[] = {
"Acre","Alagoas","Amapá","Amazonas","Bahia","Ceará","Distrito Federal",
"Espírito Santo","Goiás","Maranhão","Mato Grosso","Mato Grosso do Sul",
"Minas Gerais","Pará","Paraíba","Paraná","Pernambuco","Piauí",
"Rio de Janeiro","Rio Grande do Norte","Rio Grande do Sul",
"Rondônia","Roraima","Santa Catarina","São Paulo","Sergipe","Tocantins"
};

// 12) Mexico (32)
static String MexicoStates[] = {
"Aguascalientes","Baja California","Baja California Sur","Campeche",
"Chiapas","Chihuahua","Coahuila","Colima","Durango","Guanajuato",
"Guerrero","Hidalgo","Jalisco","Mexico City","Michoacán","Morelos",
"Nayarit","Nuevo León","Oaxaca","Puebla","Querétaro",
"Quintana Roo","San Luis Potosí","Sinaloa","Sonora","Tabasco",
"Tamaulipas","Tlaxcala","Veracruz","Yucatán","Zacatecas"
};

// 13) South Africa (9)
static String SouthAfricaStates[] = {
"Eastern Cape","Free State","Gauteng","KwaZulu-Natal",
"Limpopo","Mpumalanga","North West","Northern Cape","Western Cape"
};

// 14) Argentina (23)
static String ArgentinaStates[] = {
"Buenos Aires","Catamarca","Chaco","Chubut","Córdoba","Corrientes",
"Entre Ríos","Formosa","Jujuy","La Pampa","La Rioja","Mendoza",
"Misiones","Neuquén","Río Negro","Salta","San Juan","San Luis",
"Santa Cruz","Santa Fe","Santiago del Estero","Tierra del Fuego","Tucumán"
};

// 15) Spain (17)
static String SpainStates[] = {
"Andalusia","Aragon","Asturias","Balearic Islands","Basque Country",
"Canary Islands","Cantabria","Castile and León","Castilla-La Mancha",
"Catalonia","Extremadura","Galicia","La Rioja","Madrid",
"Murcia","Navarre","Valencian Community"
};

// 16) Turkey (81)
static String TurkeyStates[] = {
"Adana","Adıyaman","Afyonkarahisar","Ağrı","Aksaray","Amasya","Ankara","Antalya",
"Ardahan","Artvin","Aydın","Balıkesir","Bartın","Batman","Bayburt","Bilecik",
"Bingöl","Bitlis","Bolu","Burdur","Bursa","Çanakkale","Çankırı","Çorum","Denizli",
"Diyarbakır","Düzce","Edirne","Elazığ","Erzincan","Erzurum","Eskişehir","Gaziantep",
"Giresun","Gümüşhane","Hakkari","Hatay","Iğdır","Isparta","Istanbul","İzmir",
"Kahramanmaraş","Karabük","Karaman","Kars","Kastamonu","Kayseri","Kırıkkale",
"Kırklareli","Kırşehir","Kilis","Kocaeli","Konya","Kütahya","Malatya","Manisa",
"Mardin","Mersin","Muğla","Muş","Nevşehir","Niğde","Ordu","Osmaniye","Rize",
"Sakarya","Samsun","Siirt","Sinop","Sivas","Şanlıurfa","Şırnak","Tekirdağ",
"Tokat","Trabzon","Tunceli","Uşak","Van","Yalova","Yozgat","Zonguldak"
};

// 17) Saudi Arabia (13)
static String SaudiArabiaStates[] = {
"Riyadh","Mecca","Medina","Eastern Province","Asir",
"Tabuk","Hail","Jazan","Najran","Al Bahah","Al Jawf","Northern Borders","Qassim"
};

// 18) United Arab Emirates (7)
static String UnitedArabEmiratesStates[] = {
"Abu Dhabi","Dubai","Sharjah","Ajman","Umm Al Quwain","Ras Al Khaimah","Fujairah"
};

// 19) Qatar (8)
static String QatarStates[] = {
"Ad Dawhah","Al Rayyan","Al Wakrah","Al Khor","Umm Salal",
"Madinat ash Shamal","Al Daayen","Al Shahaniya"
};

// 20) Oman (11)
static String OmanStates[] = {
"Muscat","Dhofar","Al Batinah North","Al Batinah South",
"Ad Dakhiliyah","Al Sharqiyah North","Al Sharqiyah South",
"Al Dhahirah","Al Buraimi","Musandam","Al Wusta"
};

// 21) Yemen (22)
static String YemenStates[] = {
"Aden","Abyan","Ad Dali","Al Bayda","Al Hudaydah","Al Jawf",
"Al Mahrah","Al Mahwit","Amanat Al Asimah","Amran","Dhamar",
"Hadhramaut","Hajjah","Ibb","Lahij","Ma'rib","Raymah",
"Saada","Sana'a","Shabwah","Socotra","Taiz"
};

// 22) Israel (6)
static String IsraelStates[] = {
"Jerusalem","Tel Aviv","Haifa","Central","Southern","Northern"
};

// 23) Jordan (12)
static String JordanStates[] = {
"Amman","Zarqa","Irbid","Balqa","Karak","Ma'an",
"Madaba","Tafilah","Jerash","Ajloun","Aqaba","Mafraq"
};

// 24) Lebanon (8)
static String LebanonStates[] = {
"Beirut","Mount Lebanon","North","South",
"Nabatieh","Bekaa","Akkar","Baalbek-Hermel"
};

// 25) Syria (14)
static String SyriaStates[] = {
"Damascus","Rif Dimashq","Aleppo","Homs","Hama",
"Latakia","Tartus","Idlib","Raqqa","Deir ez-Zor",
"Daraa","As-Suwayda","Quneitra","Al-Hasakah"
};

// 26) Iran (31)
static String IranStates[] = {
"Tehran","Isfahan","Fars","Khorasan Razavi","East Azerbaijan",
"West Azerbaijan","Khuzestan","Kerman","Gilan","Mazandaran",
"Ardabil","Bushehr","Chaharmahal and Bakhtiari","Golestan",
"Hamadan","Hormozgan","Ilam","Kermanshah","Kohgiluyeh and Boyer-Ahmad",
"Kurdistan","Lorestan","Markazi","North Khorasan","Qazvin",
"Qom","Semnan","Sistan and Baluchestan","South Khorasan",
"Yazd","Zanjan","Alborz"
};

// 27) Iraq (19)
static String IraqStates[] = {
"Baghdad","Basra","Nineveh","Erbil","Sulaymaniyah",
"Diyala","Kirkuk","Anbar","Najaf","Karbala",
"Wasit","Babil","Muthanna","Dhi Qar","Qadisiyyah",
"Saladin","Dohuk","Halabja","Maysan"
};

// 28) Afghanistan (34)
static String AfghanistanStates[] = {
"Kabul","Kandahar","Herat","Balkh","Nangarhar","Badakhshan",
"Badghis","Baghlan","Bamyan","Daykundi","Farah","Faryab",
"Ghazni","Ghor","Helmand","Jowzjan","Kapisa","Khost","Kunar",
"Kunduz","Laghman","Logar","Nimruz","Nuristan","Paktia",
"Paktika","Panjshir","Parwan","Samangan","Sar-e Pol",
"Takhar","Uruzgan","Wardak","Zabul"
};

// 29) Pakistan (6)
static String PakistanStates[] = {
"Punjab","Sindh","Khyber Pakhtunkhwa","Balochistan",
"Gilgit-Baltistan","Islamabad Capital Territory"
};

// 30) Bangladesh (8)
static String BangladeshStates[] = {
"Dhaka","Chittagong","Rajshahi","Khulna",
"Barisal","Sylhet","Rangpur","Mymensingh"
};

// 31) Sri Lanka (9)
static String SriLankaStates[] = {
"Western","Central","Southern","Northern","Eastern",
"North Western","North Central","Uva","Sabaragamuwa"
};

// 32) Nepal (7)
static String NepalStates[] = {
"Koshi","Madhesh","Bagmati","Gandaki",
"Lumbini","Karnali","Sudurpashchim"
};

// 33) Bhutan (20)
static String BhutanStates[] = {
"Bumthang","Chukha","Dagana","Gasa","Haa","Lhuentse","Mongar",
"Paro","Pemagatshel","Punakha","Samdrup Jongkhar","Samtse",
"Sarpang","Thimphu","Trashigang","Trashiyangtse","Trongsa",
"Tsirang","Wangdue Phodrang","Zhemgang"
};

// 34) Maldives (20)
static String MaldivesStates[] = {
"Alif Alif","Alif Dhaal","Baa","Dhaalu","Faafu","Gaafu Alif",
"Gaafu Dhaalu","Gnaviyani","Haa Alif","Haa Dhaalu","Kaafu",
"Laamu","Lhaviyani","Meemu","Noonu","Raa",
"Seenu","Shaviyani","Thaa","Vaavu"
};

// 35) China Taiwan (22)
static String TaiwanStates[] = {
"Taipei","New Taipei","Taoyuan","Taichung","Tainan","Kaohsiung",
"Keelung","Hsinchu City","Chiayi City","Hsinchu County","Miaoli",
"Changhua","Nantou","Yunlin","Chiayi County","Pingtung",
"Yilan","Hualien","Taitung","Penghu","Kinmen","Lienchiang"
};

// 36) South Korea (17)
static String SouthKoreaStates[] = {
"Seoul","Busan","Daegu","Incheon","Gwangju","Daejeon","Ulsan",
"Sejong","Gyeonggi","Gangwon","North Chungcheong",
"South Chungcheong","North Jeolla","South Jeolla",
"North Gyeongsang","South Gyeongsang","Jeju"
};

// 37) North Korea (13)
static String NorthKoreaStates[] = {
"Pyongyang","Rason","South Pyongan","North Pyongan",
"Chagang","South Hwanghae","North Hwanghae",
"Kangwon","South Hamgyong","North Hamgyong",
"Ryanggang","Nampo","Kaesong"
};

// 38) Thailand (77)
static String ThailandStates[] = {
"Bangkok","Chiang Mai","Chiang Rai","Phuket","Krabi","Chonburi",
"Rayong","Trat","Ayutthaya","Nakhon Ratchasima","Khon Kaen",
"Udon Thani","Surat Thani","Songkhla","Pattani","Yala","Narathiwat"
};

// 39) Vietnam (63)
static String VietnamStates[] = {
"Hanoi","Ho Chi Minh City","Da Nang","Hai Phong","Can Tho",
"An Giang","Bac Giang","Bac Kan","Bac Lieu","Bac Ninh",
"Ben Tre","Binh Duong","Binh Dinh","Binh Phuoc","Binh Thuan",
"Ca Mau","Cao Bang","Dak Lak","Dak Nong","Dien Bien",
"Gia Lai","Ha Giang","Ha Nam","Ha Tinh","Hai Duong",
"Hau Giang","Hoa Binh","Hung Yen","Khanh Hoa","Kien Giang",
"Kon Tum","Lai Chau","Lam Dong","Lang Son","Lao Cai",
"Long An","Nam Dinh","Nghe An","Ninh Binh","Ninh Thuan",
"Phu Tho","Phu Yen","Quang Binh","Quang Nam","Quang Ngai",
"Quang Ninh","Quang Tri","Soc Trang","Son La","Tay Ninh",
"Thai Binh","Thai Nguyen","Thanh Hoa","Thua Thien Hue",
"Tien Giang","Tra Vinh","Tuyen Quang","Vinh Long",
"Vinh Phuc","Yen Bai"
};

// 40) Vietnam (63)
static String VietnamStates[] = {
"Hanoi","Ho Chi Minh City","Da Nang","Hai Phong","Can Tho",
"An Giang","Bac Giang","Bac Kan","Bac Lieu","Bac Ninh",
"Ben Tre","Binh Duong","Binh Dinh","Binh Phuoc","Binh Thuan",
"Ca Mau","Cao Bang","Dak Lak","Dak Nong","Dien Bien",
"Gia Lai","Ha Giang","Ha Nam","Ha Tinh","Hai Duong",
"Hau Giang","Hoa Binh","Hung Yen","Khanh Hoa","Kien Giang",
"Kon Tum","Lai Chau","Lam Dong","Lang Son","Lao Cai",
"Long An","Nam Dinh","Nghe An","Ninh Binh","Ninh Thuan",
"Phu Tho","Phu Yen","Quang Binh","Quang Nam","Quang Ngai",
"Quang Ninh","Quang Tri","Soc Trang","Son La","Tay Ninh",
"Thai Binh","Thai Nguyen","Thanh Hoa","Thua Thien Hue",
"Tien Giang","Tra Vinh","Tuyen Quang","Vinh Long",
"Vinh Phuc","Yen Bai"
};

// 41) Indonesia (38)
static String IndonesiaStates[] = {
"Aceh","North Sumatra","West Sumatra","Riau","Jambi","South Sumatra",
"Bengkulu","Lampung","Bangka Belitung","Riau Islands","Jakarta",
"West Java","Central Java","Yogyakarta","East Java","Banten",
"Bali","West Nusa Tenggara","East Nusa Tenggara",
"West Kalimantan","Central Kalimantan","South Kalimantan",
"East Kalimantan","North Kalimantan",
"North Sulawesi","Central Sulawesi","South Sulawesi",
"Southeast Sulawesi","Gorontalo","West Sulawesi",
"Maluku","North Maluku",
"West Papua","Southwest Papua","Central Papua",
"Highland Papua","South Papua","Papua"
};

// 42) Philippines (82)
static String PhilippinesStates[] = {
"Abra","Agusan del Norte","Agusan del Sur","Aklan","Albay","Antique",
"Apayao","Aurora","Basilan","Bataan","Batanes","Batangas","Benguet",
"Biliran","Bohol","Bukidnon","Bulacan","Cagayan","Camarines Norte",
"Camarines Sur","Camiguin","Capiz","Catanduanes","Cavite","Cebu",
"Cotabato","Davao de Oro","Davao del Norte","Davao del Sur",
"Davao Occidental","Davao Oriental","Dinagat Islands","Eastern Samar",
"Guimaras","Ifugao","Ilocos Norte","Ilocos Sur","Iloilo","Isabela",
"Kalinga","La Union","Laguna","Lanao del Norte","Lanao del Sur",
"Leyte","Maguindanao del Norte","Maguindanao del Sur","Marinduque",
"Masbate","Misamis Occidental","Misamis Oriental","Mountain Province",
"Negros Occidental","Negros Oriental","Northern Samar","Nueva Ecija",
"Nueva Vizcaya","Occidental Mindoro","Oriental Mindoro","Palawan",
"Pampanga","Pangasinan","Quezon","Quirino","Rizal","Romblon",
"Samar","Sarangani","Siquijor","Sorsogon","South Cotabato",
"Southern Leyte","Sultan Kudarat","Sulu","Surigao del Norte",
"Surigao del Sur","Tarlac","Tawi-Tawi","Zambales","Zamboanga del Norte",
"Zamboanga del Sur","Zamboanga Sibugay"
};

// 43) Malaysia (16)
static String MalaysiaStates[] = {
"Johor","Kedah","Kelantan","Malacca","Negeri Sembilan","Pahang",
"Perak","Perlis","Penang","Sabah","Sarawak","Selangor","Terengganu",
"Kuala Lumpur","Labuan","Putrajaya"
};

// 44) Singapore (5)
static String SingaporeStates[] = {
"Central Region","East Region","North Region","North-East Region","West Region"
};

// 45) Mongolia (21)
static String MongoliaStates[] = {
"Arkhangai","Bayan-Ölgii","Bayankhongor","Bulgan","Darkhan-Uul",
"Dornod","Dornogovi","Dundgovi","Govi-Altai","Govisumber",
"Khentii","Khovd","Khövsgöl","Ömnögovi","Orkhon","Övörkhangai",
"Selenge","Sükhbaatar","Töv","Uvs","Zavkhan"
};

// 46) Kazakhstan (17)
static String KazakhstanStates[] = {
"Akmola","Aktobe","Almaty Region","Atyrau","East Kazakhstan",
"Jambyl","Karaganda","Kostanay","Kyzylorda","Mangystau",
"North Kazakhstan","Pavlodar","Turkistan","West Kazakhstan",
"Abai","Jetisu","Ulytau"
};

// 47) Uzbekistan (14)
static String UzbekistanStates[] = {
"Andijan","Bukhara","Fergana","Jizzakh","Kashkadarya","Khorezm",
"Namangan","Navoiy","Samarkand","Sirdarya","Surxondaryo",
"Tashkent Region","Karakalpakstan","Tashkent City"
};

// 48) Turkmenistan (6)
static String TurkmenistanStates[] = {
"Ahal","Balkan","Dashoguz","Lebap","Mary","Ashgabat"
};

// 49) Kyrgyzstan (9)
static String KyrgyzstanStates[] = {
"Bishkek","Batken","Chuy","Issyk-Kul","Jalal-Abad",
"Naryn","Osh","Talas","Osh City"
};

// 50) Tajikistan (5)
static String TajikistanStates[] = {
"Gorno-Badakhshan","Khatlon","Sughd",
"Districts of Republican Subordination","Dushanbe"
};

// 51) Georgia (11)
static String GeorgiaStates[] = {
"Tbilisi","Adjara","Guria","Imereti","Kakheti","Kvemo Kartli",
"Mtskheta-Mtianeti","Racha-Lechkhumi","Samegrelo-Zemo Svaneti",
"Samtskhe-Javakheti","Shida Kartli"
};

// 52) Armenia (11)
static String ArmeniaStates[] = {
"Aragatsotn","Ararat","Armavir","Gegharkunik","Kotayk",
"Lori","Shirak","Syunik","Tavush","Vayots Dzor","Yerevan"
};

// 53) Azerbaijan (10)
static String AzerbaijanStates[] = {
"Baku","Ganja","Sumqayit","Lankaran","Shaki-Zagatala",
"Guba-Khachmaz","Aran","Nakhchivan","Karabakh","Shirvan"
};

// 54) Greece (13)
static String GreeceStates[] = {
"Attica","Central Greece","Central Macedonia","Crete",
"East Macedonia and Thrace","Epirus","Ionian Islands",
"North Aegean","Peloponnese","South Aegean",
"Thessaly","West Greece","West Macedonia"
};

// 55) Portugal (7)
static String PortugalStates[] = {
"Norte","Centro","Lisboa","Alentejo","Algarve","Azores","Madeira"
};

// 56) Netherlands (12)
static String NetherlandsStates[] = {
"Drenthe","Flevoland","Friesland","Gelderland","Groningen",
"Limburg","North Brabant","North Holland","Overijssel",
"South Holland","Utrecht","Zeeland"
};

// 57) Belgium (3)
static String BelgiumStates[] = {
"Flanders","Wallonia","Brussels-Capital Region"
};

// 58) Switzerland (26)
static String SwitzerlandStates[] = {
"Aargau","Appenzell Ausserrhoden","Appenzell Innerrhoden","Basel-Landschaft",
"Basel-Stadt","Bern","Fribourg","Geneva","Glarus","Graubünden",
"Jura","Lucerne","Neuchâtel","Nidwalden","Obwalden",
"Schaffhausen","Schwyz","Solothurn","St. Gallen","Thurgau",
"Ticino","Uri","Valais","Vaud","Zug","Zurich"
};

// 59) Austria (9)
static String AustriaStates[] = {
"Burgenland","Carinthia","Lower Austria","Upper Austria",
"Salzburg","Styria","Tyrol","Vorarlberg","Vienna"
};

// 60) Poland (16)
static String PolandStates[] = {
"Lower Silesian","Kuyavian-Pomeranian","Lublin","Lubusz",
"Lodz","Lesser Poland","Masovian","Opole","Subcarpathian",
"Podlaskie","Pomeranian","Silesian","Swietokrzyskie",
"Warmian-Masurian","Greater Poland","West Pomeranian"
};

// 61) Czech Republic (14)
static String CzechRepublicStates[] = {
"Prague","Central Bohemian","South Bohemian","Plzen",
"Karlovy Vary","Usti nad Labem","Liberec","Hradec Kralove",
"Pardubice","Vysocina","South Moravian","Olomouc",
"Zlin","Moravian-Silesian"
};

// 62) Slovakia (8)
static String SlovakiaStates[] = {
"Bratislava","Trnava","Trencin","Nitra",
"Zilina","Banska Bystrica","Presov","Kosice"
};

// 63) Hungary (19)
static String HungaryStates[] = {
"Bacs-Kiskun","Baranya","Bekes","Borsod-Abauj-Zemplen",
"Csongrad-Csanad","Fejer","Gyor-Moson-Sopron","Hajdu-Bihar",
"Heves","Jasz-Nagykun-Szolnok","Komarom-Esztergom","Nograd",
"Pest","Somogy","Szabolcs-Szatmar-Bereg","Tolna",
"Vas","Veszprem","Zala"
};

// 64) Romania (42)
static String RomaniaStates[] = {
"Alba","Arad","Arges","Bacau","Bihor","Bistrita-Nasaud","Botosani",
"Braila","Brasov","Buzau","Calarasi","Caras-Severin","Cluj",
"Constanta","Covasna","Dambovita","Dolj","Galati","Giurgiu",
"Gorj","Harghita","Hunedoara","Ialomita","Iasi","Ilfov",
"Maramures","Mehedinti","Mures","Neamt","Olt","Prahova",
"Satu Mare","Salaj","Sibiu","Suceava","Teleorman","Timis",
"Tulcea","Valcea","Vaslui","Vrancea","Bucharest"
};

// 65) Bulgaria (28)
static String BulgariaStates[] = {
"Blagoevgrad","Burgas","Dobrich","Gabrovo","Haskovo",
"Kardzhali","Kyustendil","Lovech","Montana","Pazardzhik",
"Pernik","Pleven","Plovdiv","Razgrad","Ruse","Shumen",
"Silistra","Sliven","Smolyan","Sofia City","Sofia Province",
"Stara Zagora","Targovishte","Varna","Veliko Tarnovo",
"Vidin","Vratsa","Yambol"
};

// 66) Indonesia (38)
static String IndonesiaStates[] = {
"Aceh","North Sumatra","West Sumatra","Riau","Jambi","South Sumatra",
"Bengkulu","Lampung","Bangka Belitung","Riau Islands","Jakarta",
"West Java","Central Java","Yogyakarta","East Java","Banten",
"Bali","West Nusa Tenggara","East Nusa Tenggara",
"West Kalimantan","Central Kalimantan","South Kalimantan",
"East Kalimantan","North Kalimantan",
"North Sulawesi","Central Sulawesi","South Sulawesi",
"Southeast Sulawesi","Gorontalo","West Sulawesi",
"Maluku","North Maluku",
"West Papua","Southwest Papua","Central Papua",
"Highland Papua","South Papua","Papua"
};

// 67) Philippines (82)
static String PhilippinesStates[] = {
"Abra","Agusan del Norte","Agusan del Sur","Aklan","Albay","Antique",
"Apayao","Aurora","Basilan","Bataan","Batanes","Batangas","Benguet",
"Biliran","Bohol","Bukidnon","Bulacan","Cagayan","Camarines Norte",
"Camarines Sur","Camiguin","Capiz","Catanduanes","Cavite","Cebu",
"Cotabato","Davao de Oro","Davao del Norte","Davao del Sur",
"Davao Occidental","Davao Oriental","Dinagat Islands","Eastern Samar",
"Guimaras","Ifugao","Ilocos Norte","Ilocos Sur","Iloilo","Isabela",
"Kalinga","La Union","Laguna","Lanao del Norte","Lanao del Sur",
"Leyte","Maguindanao del Norte","Maguindanao del Sur","Marinduque",
"Masbate","Misamis Occidental","Misamis Oriental","Mountain Province",
"Negros Occidental","Negros Oriental","Northern Samar","Nueva Ecija",
"Nueva Vizcaya","Occidental Mindoro","Oriental Mindoro","Palawan",
"Pampanga","Pangasinan","Quezon","Quirino","Rizal","Romblon",
"Samar","Sarangani","Siquijor","Sorsogon","South Cotabato",
"Southern Leyte","Sultan Kudarat","Sulu","Surigao del Norte",
"Surigao del Sur","Tarlac","Tawi-Tawi","Zambales","Zamboanga del Norte",
"Zamboanga del Sur","Zamboanga Sibugay"
};

// 68) Malaysia (16)
static String MalaysiaStates[] = {
"Johor","Kedah","Kelantan","Malacca","Negeri Sembilan","Pahang",
"Perak","Perlis","Penang","Sabah","Sarawak","Selangor","Terengganu",
"Kuala Lumpur","Labuan","Putrajaya"
};

// 69) Singapore (5)
static String SingaporeStates[] = {
"Central Region","East Region","North Region","North-East Region","West Region"
};

// 70) Mongolia (21)
static String MongoliaStates[] = {
"Arkhangai","Bayan-Ölgii","Bayankhongor","Bulgan","Darkhan-Uul",
"Dornod","Dornogovi","Dundgovi","Govi-Altai","Govisumber",
"Khentii","Khovd","Khövsgöl","Ömnögovi","Orkhon","Övörkhangai",
"Selenge","Sükhbaatar","Töv","Uvs","Zavkhan"
};

// 71) Kazakhstan (17)
static String KazakhstanStates[] = {
"Akmola","Aktobe","Almaty Region","Atyrau","East Kazakhstan",
"Jambyl","Karaganda","Kostanay","Kyzylorda","Mangystau",
"North Kazakhstan","Pavlodar","Turkistan","West Kazakhstan",
"Abai","Jetisu","Ulytau"
};

// 72) Uzbekistan (14)
static String UzbekistanStates[] = {
"Andijan","Bukhara","Fergana","Jizzakh","Kashkadarya","Khorezm",
"Namangan","Navoiy","Samarkand","Sirdarya","Surxondaryo",
"Tashkent Region","Karakalpakstan","Tashkent City"
};

// 73) Turkmenistan (6)
static String TurkmenistanStates[] = {
"Ahal","Balkan","Dashoguz","Lebap","Mary","Ashgabat"
};

// 74) Kyrgyzstan (9)
static String KyrgyzstanStates[] = {
"Bishkek","Batken","Chuy","Issyk-Kul","Jalal-Abad",
"Naryn","Osh","Talas","Osh City"
};

// 75) Tajikistan (5)
static String TajikistanStates[] = {
"Gorno-Badakhshan","Khatlon","Sughd",
"Districts of Republican Subordination","Dushanbe"
};

// 76) Georgia (11)
static String GeorgiaStates[] = {
"Tbilisi","Adjara","Guria","Imereti","Kakheti","Kvemo Kartli",
"Mtskheta-Mtianeti","Racha-Lechkhumi","Samegrelo-Zemo Svaneti",
"Samtskhe-Javakheti","Shida Kartli"
};

// 77) Armenia (11)
static String ArmeniaStates[] = {
"Aragatsotn","Ararat","Armavir","Gegharkunik","Kotayk",
"Lori","Shirak","Syunik","Tavush","Vayots Dzor","Yerevan"
};

// 78) Azerbaijan (10)
static String AzerbaijanStates[] = {
"Baku","Ganja","Sumqayit","Lankaran","Shaki-Zagatala",
"Guba-Khachmaz","Aran","Nakhchivan","Karabakh","Shirvan"
};

// 79) Greece (13)
static String GreeceStates[] = {
"Attica","Central Greece","Central Macedonia","Crete",
"East Macedonia and Thrace","Epirus","Ionian Islands",
"North Aegean","Peloponnese","South Aegean",
"Thessaly","West Greece","West Macedonia"
};

// 80) Portugal (7)
static String PortugalStates[] = {
"Norte","Centro","Lisboa","Alentejo","Algarve","Azores","Madeira"
};

// 81) Netherlands (12)
static String NetherlandsStates[] = {
"Drenthe","Flevoland","Friesland","Gelderland","Groningen",
"Limburg","North Brabant","North Holland","Overijssel",
"South Holland","Utrecht","Zeeland"
};

// 82) Belgium (3)
static String BelgiumStates[] = {
"Flanders","Wallonia","Brussels-Capital Region"
};

// 83) Switzerland (26)
static String SwitzerlandStates[] = {
"Aargau","Appenzell Ausserrhoden","Appenzell Innerrhoden","Basel-Landschaft",
"Basel-Stadt","Bern","Fribourg","Geneva","Glarus","Graubünden",
"Jura","Lucerne","Neuchâtel","Nidwalden","Obwalden",
"Schaffhausen","Schwyz","Solothurn","St. Gallen","Thurgau",
"Ticino","Uri","Valais","Vaud","Zug","Zurich"
};

// 84) Austria (9)
static String AustriaStates[] = {
"Burgenland","Carinthia","Lower Austria","Upper Austria",
"Salzburg","Styria","Tyrol","Vorarlberg","Vienna"
};

// 85) Poland (16)
static String PolandStates[] = {
"Lower Silesian","Kuyavian-Pomeranian","Lublin","Lubusz",
"Lodz","Lesser Poland","Masovian","Opole","Subcarpathian",
"Podlaskie","Pomeranian","Silesian","Swietokrzyskie",
"Warmian-Masurian","Greater Poland","West Pomeranian"
};

// 86) Czech Republic (14)
static String CzechRepublicStates[] = {
"Prague","Central Bohemian","South Bohemian","Plzen",
"Karlovy Vary","Usti nad Labem","Liberec","Hradec Kralove",
"Pardubice","Vysocina","South Moravian","Olomouc",
"Zlin","Moravian-Silesian"
};

// 87) Slovakia (8)
static String SlovakiaStates[] = {
"Bratislava","Trnava","Trencin","Nitra",
"Zilina","Banska Bystrica","Presov","Kosice"
};

// 88) Hungary (19)
static String HungaryStates[] = {
"Bacs-Kiskun","Baranya","Bekes","Borsod-Abauj-Zemplen",
"Csongrad-Csanad","Fejer","Gyor-Moson-Sopron","Hajdu-Bihar",
"Heves","Jasz-Nagykun-Szolnok","Komarom-Esztergom","Nograd",
"Pest","Somogy","Szabolcs-Szatmar-Bereg","Tolna",
"Vas","Veszprem","Zala"
};

// 89) Romania (42)
static String RomaniaStates[] = {
"Alba","Arad","Arges","Bacau","Bihor","Bistrita-Nasaud","Botosani",
"Braila","Brasov","Buzau","Calarasi","Caras-Severin","Cluj",
"Constanta","Covasna","Dambovita","Dolj","Galati","Giurgiu",
"Gorj","Harghita","Hunedoara","Ialomita","Iasi","Ilfov",
"Maramures","Mehedinti","Mures","Neamt","Olt","Prahova",
"Satu Mare","Salaj","Sibiu","Suceava","Teleorman","Timis",
"Tulcea","Valcea","Vaslui","Vrancea","Bucharest"
};

// 90) Bulgaria (28)
static String BulgariaStates[] = {
"Blagoevgrad","Burgas","Dobrich","Gabrovo","Haskovo",
"Kardzhali","Kyustendil","Lovech","Montana","Pazardzhik",
"Pernik","Pleven","Plovdiv","Razgrad","Ruse","Shumen",
"Silistra","Sliven","Smolyan","Sofia City","Sofia Province",
"Stara Zagora","Targovishte","Varna","Veliko Tarnovo",
"Vidin","Vratsa","Yambol"
};

// 91) Croatia (20)
static String CroatiaStates[] = {
"Zagreb County","Krapina-Zagorje","Sisak-Moslavina","Karlovac",
"Varaždin","Koprivnica-Križevci","Bjelovar-Bilogora","Primorje-Gorski Kotar",
"Lika-Senj","Virovitica-Podravina","Požega-Slavonia","Brod-Posavina",
"Zadar","Osijek-Baranja","Šibenik-Knin","Vukovar-Syrmia",
"Split-Dalmatia","Istria","Dubrovnik-Neretva","Međimurje"
};

// 92) Slovenia (12)
static String SloveniaStates[] = {
"Upper Carniola","Lower Carniola","Inner Carniola",
"Gorizia","Slovenian Istria","Carinthia","Savinja",
"Central Slovenia","Drava","Mura","Southeast Slovenia","Littoral–Inner Carniola"
};

// 93) Bosnia and Herzegovina (2)
static String BosniaandHerzegovinaStates[] = {
"Federation of Bosnia and Herzegovina","Republika Srpska"
};

// 94) Serbia (2)
static String SerbiaStates[] = {
"Vojvodina","Central Serbia"
};

// 95) Montenegro (25)
static String MontenegroStates[] = {
"Podgorica","Nikšić","Pljevlja","Bijelo Polje","Cetinje","Bar",
"Herceg Novi","Berane","Budva","Ulcinj","Tivat","Rožaje",
"Kotor","Danilovgrad","Mojkovac","Kolašin","Plav","Andrijevica",
"Žabljak","Šavnik","Petnjica","Gusinje","Tuzi","Zeta","Plužine"
};

// 96) North Macedonia (8)
static String NorthMacedoniaStates[] = {
"Skopje","Polog","Pelagonia","Vardar",
"Eastern","Southwestern","Southeastern","Northeastern"
};

// 97) Albania (12)
static String AlbaniaStates[] = {
"Berat","Dibër","Durrës","Elbasan","Fier","Gjirokastër",
"Korçë","Kukës","Lezhë","Shkodër","Tirana","Vlorë"
};

// 98) Estonia (15)
static String EstoniaStates[] = {
"Harju","Hiiu","Ida-Viru","Jõgeva","Järva","Lääne",
"Lääne-Viru","Põlva","Pärnu","Rapla",
"Saare","Tartu","Valga","Viljandi","Võru"
};

// 99) Latvia (6)
static String LatviaStates[] = {
"Riga","Daugavpils","Jelgava","Jurmala","Liepaja","Ventspils"
};

// 100) Lithuania (10)
static String LithuaniaStates[] = {
"Alytus","Kaunas","Klaipeda","Marijampole","Panevezys",
"Siauliai","Taurage","Telsiai","Utena","Vilnius"
};

// 101) Belarus (6)
static String BelarusStates[] = {
"Brest","Gomel","Grodno","Minsk Region","Mogilev","Vitebsk"
};

// 102) Ukraine (24)
static String UkraineStates[] = {
"Vinnytsia","Volyn","Dnipropetrovsk","Donetsk","Zhytomyr","Zakarpattia",
"Zaporizhzhia","Ivano-Frankivsk","Kyiv Region","Kirovohrad",
"Luhansk","Lviv","Mykolaiv","Odesa","Poltava",
"Rivne","Sumy","Ternopil","Kharkiv","Kherson",
"Khmelnytskyi","Cherkasy","Chernivtsi","Chernihiv"
};

// 103) Moldova (32)
static String MoldovaStates[] = {
"Anenii Noi","Balti","Basarabeasca","Bender","Briceni","Cahul",
"Calarasi","Cantemir","Causeni","Chisinau","Cimislia",
"Crîuleni","Donduseni","Drochia","Dubasari","Edinet",
"Falesti","Floresti","Glodeni","Hîncești","Ialoveni",
"Leova","Nisporeni","Ocnita","Orhei","Rezina",
"Rîscani","Sîngerei","Soroca","Stefan Voda",
"Straseni","Taraclia"
};

// 104) Russia (85)
static String RussiaStates[] = {
"Adygea","Altai Republic","Bashkortostan","Buryatia","Chechnya","Chuvashia",
"Dagestan","Ingushetia","Kabardino-Balkaria","Kalmykia","Karachay-Cherkessia",
"Karelia","Komi","Mari El","Mordovia","North Ossetia–Alania",
"Sakha","Tatarstan","Tuva","Udmurtia","Altai Krai","Kamchatka Krai",
"Khabarovsk Krai","Krasnodar Krai","Krasnoyarsk Krai","Perm Krai",
"Primorsky Krai","Stavropol Krai","Zabaykalsky Krai","Amur Oblast",
"Arkhangelsk Oblast","Astrakhan Oblast","Belgorod Oblast","Bryansk Oblast",
"Chelyabinsk Oblast","Irkutsk Oblast","Ivanovo Oblast","Kaliningrad Oblast",
"Kaluga Oblast","Kemerovo Oblast","Kirov Oblast","Kostroma Oblast",
"Kurgan Oblast","Kursk Oblast","Leningrad Oblast","Lipetsk Oblast",
"Magadan Oblast","Moscow Oblast","Murmansk Oblast","Nizhny Novgorod Oblast",
"Novgorod Oblast","Novosibirsk Oblast","Omsk Oblast","Orenburg Oblast",
"Oryol Oblast","Penza Oblast","Pskov Oblast","Rostov Oblast",
"Ryazan Oblast","Sakhalin Oblast","Samara Oblast","Saratov Oblast",
"Smolensk Oblast","Sverdlovsk Oblast","Tambov Oblast","Tomsk Oblast",
"Tula Oblast","Tver Oblast","Tyumen Oblast","Ulyanovsk Oblast",
"Vladimir Oblast","Volgograd Oblast","Vologda Oblast","Voronezh Oblast",
"Yaroslavl Oblast","Moscow","Saint Petersburg","Sevastopol",
"Jewish Autonomous Oblast","Nenets Autonomous Okrug",
"Khanty-Mansi Autonomous Okrug","Chukotka Autonomous Okrug",
"Yamalo-Nenets Autonomous Okrug"
};

// 105) Egypt (27)
static String EgyptStates[] = {
"Cairo","Giza","Alexandria","Dakahlia","Red Sea",
"Beheira","Fayoum","Gharbia","Ismailia","Menofia",
"Minya","Qalyubia","New Valley","Suez","Aswan",
"Assiut","Beni Suef","Port Said","Damietta","Sharkia",
"South Sinai","Kafr El Sheikh","Matrouh","Luxor",
"Qena","North Sinai","Sohag"
};

// 106) Morocco (12)
static String MoroccoStates[] = {
"Casablanca-Settat","Rabat-Salé-Kénitra","Marrakesh-Safi",
"Fès-Meknès","Tanger-Tetouan-Al Hoceima","Souss-Massa",
"Oriental","Beni Mellal-Khénifra","Drâa-Tafilalet",
"Guelmim-Oued Noun","Laâyoune-Sakia El Hamra","Dakhla-Oued Ed-Dahab"
};

// 107) Algeria (58)
static String AlgeriaStates[] = {
"Adrar","Chlef","Laghouat","Oum El Bouaghi","Batna","Béjaïa","Biskra","Béchar",
"Blida","Bouira","Tamanrasset","Tébessa","Tlemcen","Tiaret","Tizi Ouzou",
"Algiers","Djelfa","Jijel","Sétif","Saïda","Skikda","Sidi Bel Abbès",
"Annaba","Guelma","Constantine","Médéa","Mostaganem","M'Sila",
"Mascara","Ouargla","Oran","El Bayadh","Illizi","Bordj Bou Arréridj",
"Boumerdès","El Tarf","Tindouf","Tissemsilt","El Oued","Khenchela",
"Souk Ahras","Tipaza","Mila","Aïn Defla","Naâma","Aïn Témouchent",
"Ghardaïa","Relizane","Timimoun","Bordj Badji Mokhtar",
"Ouled Djellal","Béni Abbès","In Salah","In Guezzam","Touggourt",
"Djanet","El M'Ghair","El Meniaa"
};

// 108) Tunisia (24)
static String TunisiaStates[] = {
"Tunis","Ariana","Ben Arous","Manouba","Nabeul","Zaghouan",
"Bizerte","Béja","Jendouba","Kef","Siliana","Sousse",
"Monastir","Mahdia","Sfax","Kairouan","Kasserine",
"Sidi Bouzid","Gabès","Medenine","Tataouine",
"Gafsa","Tozeur","Kebili"
};

// 109) Libya (22)
static String LibyaStates[] = {
"Tripoli","Benghazi","Misrata","Zawiya","Bayda","Zliten",
"Ajdabiya","Sabha","Sirte","Derna","Tobruk","Ghat",
"Murzuq","Nalut","Kufra","Jalu","Awjila","Bani Walid",
"Al Khums","Tarhuna","Al Marj","Sabratha"
};

// 110) Sudan (18)
static String SudanStates[] = {
"Khartoum","Gezira","Red Sea","Kassala","Gedaref",
"Sennar","White Nile","Blue Nile","North Kordofan",
"South Kordofan","West Kordofan","North Darfur",
"South Darfur","West Darfur","Central Darfur",
"East Darfur","River Nile","Northern"
};

// 111) South Sudan (10)
static String SouthSudanStates[] = {
"Central Equatoria","Eastern Equatoria","Western Equatoria",
"Jonglei","Unity","Upper Nile","Lakes","Warrap",
"Western Bahr el Ghazal","Northern Bahr el Ghazal"
};

// 112) Ethiopia (12)
static String EthiopiaStates[] = {
"Oromia","Amhara","Tigray","Somali","Afar",
"Benishangul-Gumuz","Gambela","Harari",
"Sidama","South Ethiopia","Central Ethiopia",
"Addis Ababa"
};

// 113) Kenya (47)
static String KenyaStates[] = {
"Baringo","Bomet","Bungoma","Busia","Elgeyo-Marakwet","Embu",
"Garissa","Homa Bay","Isiolo","Kajiado","Kakamega","Kericho",
"Kiambu","Kilifi","Kirinyaga","Kisii","Kisumu","Kitui",
"Kwale","Laikipia","Lamu","Machakos","Makueni","Mandera",
"Marsabit","Meru","Migori","Mombasa","Murang'a","Nairobi",
"Nakuru","Nandi","Narok","Nyamira","Nyandarua","Nyeri",
"Samburu","Siaya","Taita-Taveta","Tana River","Tharaka-Nithi",
"Trans Nzoia","Turkana","Uasin Gishu","Vihiga","Wajir","West Pokot"
};

// 114) Tanzania (31)
static String TanzaniaStates[] = {
"Arusha","Dar es Salaam","Dodoma","Geita","Iringa","Kagera",
"Katavi","Kigoma","Kilimanjaro","Lindi","Manyara","Mara",
"Mbeya","Morogoro","Mtwara","Mwanza","Njombe","Pemba North",
"Pemba South","Pwani","Rukwa","Ruvuma","Shinyanga",
"Simiyu","Singida","Songwe","Tabora","Tanga",
"Zanzibar North","Zanzibar South","Zanzibar West"
};

// 115) Uganda (4)
static String UgandaStates[] = {
"Central","Western","Eastern","Northern"
};

// 116) Rwanda (5)
static String RwandaStates[] = {
"Kigali","Northern","Southern","Eastern","Western"
};

// 117) Burundi (18)
static String BurundiStates[] = {
"Bubanza","Bujumbura Mairie","Bujumbura Rural","Bururi",
"Cankuzo","Cibitoke","Gitega","Karuzi","Kayanza",
"Kirundo","Makamba","Muramvya","Muyinga","Mwaro",
"Ngozi","Rumonge","Rutana","Ruyigi"
};

// 118) Somalia (18)
static String SomaliaStates[] = {
"Awdal","Bakool","Banaadir","Bari","Bay","Galguduud",
"Gedo","Hiran","Lower Juba","Lower Shabelle","Middle Juba",
"Middle Shabelle","Mudug","Nugal","Sanaag","Sool",
"Togdheer","Woqooyi Galbeed"
};

// 119) Djibouti (6)
static String DjiboutiStates[] = {
"Ali Sabieh","Arta","Dikhil","Djibouti","Obock","Tadjourah"
};

// 120) Eritrea (6)
static String EritreaStates[] = {
"Anseba","Debub","Debubawi Keyih Bahri",
"Gash-Barka","Maekel","Semienawi Keyih Bahri"
};

// 121) Nigeria (36)
static String NigeriaStates[] = {
"Abia","Adamawa","Akwa Ibom","Anambra","Bauchi","Bayelsa",
"Benue","Borno","Cross River","Delta","Ebonyi","Edo",
"Ekiti","Enugu","Gombe","Imo","Jigawa","Kaduna","Kano",
"Katsina","Kebbi","Kogi","Kwara","Lagos","Nasarawa",
"Niger","Ogun","Ondo","Osun","Oyo","Plateau",
"Rivers","Sokoto","Taraba","Yobe","Zamfara"
};

// 122) Ghana (16)
static String GhanaStates[] = {
"Ahafo","Ashanti","Bono","Bono East","Central",
"Eastern","Greater Accra","North East","Northern",
"Oti","Savannah","Upper East","Upper West",
"Volta","Western","Western North"
};

// 123) Ivory Coast (14)
static String IvoryCoastStates[] = {
"Abidjan","Bas-Sassandra","Comoé","Denguélé","Gôh-Djiboua",
"Lacs","Lagunes","Montagnes","Sassandra-Marahoué",
"Savanes","Vallée du Bandama","Woroba","Yamoussoukro","Zanzan"
};

// 124) Senegal (14)
static String SenegalStates[] = {
"Dakar","Diourbel","Fatick","Kaffrine","Kaolack",
"Kédougou","Kolda","Louga","Matam","Saint-Louis",
"Sédhiou","Tambacounda","Thiès","Ziguinchor"
};

// 125) Mali (10)
static String MaliStates[] = {
"Bamako","Gao","Kayes","Kidal","Koulikoro",
"Ménaka","Mopti","Ségou","Sikasso","Taoudénit"
};

// 126) Niger (8)
static String NigerStates[] = {
"Agadez","Diffa","Dosso","Maradi",
"Tahoua","Tillabéri","Zinder","Niamey"
};

// 127) Chad (23)
static String ChadStates[] = {
"Bahr el Gazel","Batha","Borkou","Chari-Baguirmi",
"Ennedi Est","Ennedi Ouest","Guéra","Hadjer-Lamis",
"Kanem","Lac","Logone Occidental","Logone Oriental",
"Mandoul","Mayo-Kebbi Est","Mayo-Kebbi Ouest",
"Moyen-Chari","N'Djamena","Ouaddaï","Salamat",
"Sila","Tandjilé","Tibesti","Wadi Fira"
};

// 128) Cameroon (10)
static String CameroonStates[] = {
"Adamawa","Centre","East","Far North","Littoral",
"North","Northwest","South","Southwest","West"
};

// 129) Central African Republic (16)
static String CentralAfricanRepublicStates[] = {
"Bamingui-Bangoran","Bangui","Basse-Kotto","Haute-Kotto",
"Haut-Mbomou","Kémo","Lobaye","Mambéré-Kadéï",
"Mbomou","Nana-Grébizi","Nana-Mambéré","Ombella-M'Poko",
"Ouaka","Ouham","Ouham-Pendé","Vakaga"
};

// 130) Democratic Republic of the Congo (26)
static String DR CongoStates[] = {
"Bas-Uélé","Équateur","Haut-Katanga","Haut-Lomami",
"Haut-Uélé","Ituri","Kasaï","Kasaï-Central",
"Kasaï-Oriental","Kinshasa","Kongo Central",
"Kwango","Kwilu","Lomami","Lualaba","Mai-Ndombe",
"Maniema","Mongala","Nord-Kivu","Nord-Ubangi",
"Sankuru","Sud-Kivu","Sud-Ubangi",
"Tanganyika","Tshopo","Tshuapa"
};

// 131) Republic of the Congo (12)
static String CongoStates[] = {
"Bouenza","Brazzaville","Cuvette","Cuvette-Ouest",
"Kouilou","Lékoumou","Likouala","Niari",
"Plateaux","Pointe-Noire","Pool","Sangha"
};

// 132) Gabon (9)
static String GabonStates[] = {
"Estuaire","Haut-Ogooué","Moyen-Ogooué",
"Ngounié","Nyanga","Ogooué-Ivindo",
"Ogooué-Lolo","Ogooué-Maritime","Woleu-Ntem"
};

// 133) Equatorial Guinea (8)
static String EquatorialGuineaStates[] = {
"Annobón","Bioko Norte","Bioko Sur","Centro Sur",
"Kié-Ntem","Litoral","Wele-Nzas","Djibloho"
};

// 134) Angola (18)
static String AngolaStates[] = {
"Bengo","Benguela","Bié","Cabinda","Cuando Cubango",
"Cuanza Norte","Cuanza Sul","Cunene","Huambo",
"Huíla","Luanda","Lunda Norte","Lunda Sul",
"Malanje","Moxico","Namibe","Uíge","Zaire"
};

// 135) Namibia (14)
static String NamibiaStates[] = {
"Erongo","Hardap","Karas","Kavango East",
"Kavango West","Khomas","Kunene","Ohangwena",
"Omaheke","Omusati","Oshana","Oshikoto",
"Otjozondjupa","Zambezi"
};

// 136) Botswana (10)
static String BotswanaStates[] = {
"Central","Ghanzi","Kgalagadi","Kgatleng",
"Kweneng","North-East","North-West",
"South-East","Southern","Gaborone"
};

// 137) Zimbabwe (10)
static String ZimbabweStates[] = {
"Bulawayo","Harare","Manicaland","Mashonaland Central",
"Mashonaland East","Mashonaland West","Masvingo",
"Matabeleland North","Matabeleland South","Midlands"
};

// 138) Zambia (10)
static String ZambiaStates[] = {
"Central","Copperbelt","Eastern","Luapula",
"Lusaka","Muchinga","Northern",
"North-Western","Southern","Western"
};

// 139) Mozambique (11)
static String MozambiqueStates[] = {
"Cabo Delgado","Gaza","Inhambane","Manica",
"Maputo Province","Maputo City","Nampula",
"Niassa","Sofala","Tete","Zambezia"
};

// 140) Madagascar (22)
static String MadagascarStates[] = {
"Analamanga","Atsinanana","Boeny","Bongolava",
"Diana","Haute Matsiatra","Ihorombe",
"Itasy","Melaky","Menabe","Sava",
"Sofia","Vakinankaratra","Vatovavy",
"Fitovinany","Atsimo-Andrefana",
"Androy","Anosy","Atsimo-Atsinanana",
"Amoron'i Mania","Betsiboka","Alaotra-Mangoro"
};

// 141) Malawi (3)
static String MalawiStates[] = {
"Northern","Central","Southern"
};

// 142) Mauritius (9)
static String MauritiusStates[] = {
"Black River","Flacq","Grand Port","Moka",
"Pamplemousses","Plaines Wilhems","Port Louis",
"Rivière du Rempart","Savanne"
};

// 143) Seychelles (26)
static String SeychellesStates[] = {
"Anse aux Pins","Anse Boileau","Anse Etoile","Anse Royale",
"Au Cap","Baie Lazare","Baie Sainte Anne","Beau Vallon",
"Bel Air","Bel Ombre","Cascade","English River",
"Glacis","Grand'Anse Mahé","Grand'Anse Praslin",
"La Digue","La Rivière Anglaise","Mont Buxton",
"Mont Fleuri","Plaisance","Pointe La Rue",
"Port Glaud","Roche Caiman","Saint Louis",
"Takamaka","Les Mamelles"
};

// 144) Comoros (3)
static String ComorosStates[] = {
"Grande Comore","Anjouan","Mohéli"
};

// 145) Lesotho (10)
static String LesothoStates[] = {
"Berea","Butha-Buthe","Leribe","Mafeteng","Maseru",
"Mohale's Hoek","Mokhotlong","Qacha's Nek",
"Quthing","Thaba-Tseka"
};

// 146) Eswatini (4)
static String EswatiniStates[] = {
"Hhohho","Lubombo","Manzini","Shiselweni"
};

// 147) Cape Verde (22)
static String CapeVerdeStates[] = {
"Boa Vista","Brava","Maio","Mosteiros","Paul",
"Porto Novo","Praia","Ribeira Brava",
"Ribeira Grande","Ribeira Grande de Santiago",
"Sal","Santa Catarina","Santa Catarina do Fogo",
"Santa Cruz","São Domingos","São Filipe",
"São Lourenço dos Órgãos","São Miguel",
"São Salvador do Mundo","São Vicente",
"Tarrafal","Tarrafal de São Nicolau"
};

// 148) São Tomé and Príncipe (7)
static String SaoTomeStates[] = {
"Água Grande","Cantagalo","Caué",
"Lembá","Lobata","Mé-Zóchi","Príncipe"
};

// 149) Gambia (7)
static String GambiaStates[] = {
"Banjul","Kanifing","Lower River",
"Central River","North Bank",
"Upper River","West Coast"
};

// 150) Guinea-Bissau (8)
static String GuineaBissauStates[] = {
"Bafatá","Biombo","Bolama","Cacheu",
"Gabu","Oio","Quinara","Tombali"
};

// 151) Liberia (15)
static String LiberiaStates[] = {
"Bomi","Bong","Gbarpolu","Grand Bassa","Grand Cape Mount",
"Grand Gedeh","Grand Kru","Lofa","Margibi","Maryland",
"Montserrado","Nimba","River Cess","River Gee","Sinoe"
};

// 152) Sierra Leone (5)
static String SierraLeoneStates[] = {
"Eastern","Northern","North Western","Southern","Western Area"
};

// 153) Togo (5)
static String TogoStates[] = {
"Centrale","Kara","Maritime","Plateaux","Savanes"
};

// 154) Benin (12)
static String BeninStates[] = {
"Alibori","Atakora","Atlantique","Borgou","Collines",
"Donga","Kouffo","Littoral","Mono",
"Ouémé","Plateau","Zou"
};

// 155) Burkina Faso (13)
static String BurkinaFasoStates[] = {
"Boucle du Mouhoun","Cascades","Centre",
"Centre-Est","Centre-Nord","Centre-Ouest",
"Centre-Sud","Est","Hauts-Bassins",
"Nord","Plateau-Central","Sahel","Sud-Ouest"
};

// 156) Guinea (8)
static String GuineaStates[] = {
"Boké","Conakry","Faranah",
"Kankan","Kindia","Labé",
"Mamou","Nzérékoré"
};

// 157) Eritrea (6)
static String EritreaStates[] = {
"Anseba","Debub","Debubawi Keyih Bahri",
"Gash-Barka","Maekel","Semienawi Keyih Bahri"
};

// 158) Djibouti (6)
static String DjiboutiStates[] = {
"Ali Sabieh","Arta","Dikhil","Djibouti","Obock","Tadjourah"
};

// 159) Somalia (18)
static String SomaliaStates[] = {
"Awdal","Bakool","Banaadir","Bari","Bay","Galguduud",
"Gedo","Hiran","Lower Juba","Lower Shabelle",
"Middle Juba","Middle Shabelle","Mudug",
"Nugal","Sanaag","Sool","Togdheer","Woqooyi Galbeed"
};

// 160) Rwanda (5)
static String RwandaStates[] = {
"Kigali","Northern","Southern","Eastern","Western"
};

// 161) Burundi (18)
static String BurundiStates[] = {
"Bubanza","Bujumbura Mairie","Bujumbura Rural","Bururi",
"Cankuzo","Cibitoke","Gitega","Karuzi","Kayanza",
"Kirundo","Makamba","Muramvya","Muyinga","Mwaro",
"Ngozi","Rumonge","Rutana","Ruyigi"
};

// 162) Uganda (4)
static String UgandaStates[] = {
"Central","Western","Eastern","Northern"
};

// 163) Tanzania (31)
static String TanzaniaStates[] = {
"Arusha","Dar es Salaam","Dodoma","Geita","Iringa",
"Kagera","Katavi","Kigoma","Kilimanjaro","Lindi",
"Manyara","Mara","Mbeya","Morogoro","Mtwara",
"Mwanza","Njombe","Pwani","Rukwa","Ruvuma",
"Shinyanga","Simiyu","Singida","Songwe","Tabora",
"Tanga","Zanzibar North","Zanzibar South",
"Zanzibar West","Pemba North","Pemba South"
};

// 164) Kenya (47)
static String KenyaStates[] = {
"Baringo","Bomet","Bungoma","Busia","Elgeyo-Marakwet","Embu",
"Garissa","Homa Bay","Isiolo","Kajiado","Kakamega","Kericho",
"Kiambu","Kilifi","Kirinyaga","Kisii","Kisumu","Kitui",
"Kwale","Laikipia","Lamu","Machakos","Makueni","Mandera",
"Marsabit","Meru","Migori","Mombasa","Murang'a","Nairobi",
"Nakuru","Nandi","Narok","Nyamira","Nyandarua","Nyeri",
"Samburu","Siaya","Taita-Taveta","Tana River","Tharaka-Nithi",
"Trans Nzoia","Turkana","Uasin Gishu","Vihiga","Wajir","West Pokot"
};

// 165) Malawi (3)
static String MalawiStates[] = {
"Northern Region","Central Region","Southern Region"
};

// 166) Mauritius (9)
static String MauritiusStates[] = {
"Black River","Flacq","Grand Port","Moka",
"Pamplemousses","Plaines Wilhems","Port Louis",
"Rivière du Rempart","Savanne"
};

// 167) Seychelles (26)
static String SeychellesStates[] = {
"Anse aux Pins","Anse Boileau","Anse Etoile","Anse Royale",
"Au Cap","Baie Lazare","Baie Sainte Anne","Beau Vallon",
"Bel Air","Bel Ombre","Cascade","English River",
"Glacis","Grand'Anse Mahé","Grand'Anse Praslin",
"La Digue","Mont Buxton","Mont Fleuri","Plaisance",
"Pointe La Rue","Port Glaud","Roche Caiman",
"Saint Louis","Takamaka","Les Mamelles","Baie Lazare"
};

// 168) Comoros (3)
static String ComorosStates[] = {
"Grande Comore","Anjouan","Mohéli"
};

// 169) Lesotho (10)
static String LesothoStates[] = {
"Berea","Butha-Buthe","Leribe","Mafeteng","Maseru",
"Mohale's Hoek","Mokhotlong","Qacha's Nek",
"Quthing","Thaba-Tseka"
};

// 170) Eswatini (4)
static String EswatiniStates[] = {
"Hhohho","Lubombo","Manzini","Shiselweni"
};

// 171) Cape Verde (22)
static String CapeVerdeStates[] = {
"Boa Vista","Brava","Maio","Mosteiros","Paul",
"Porto Novo","Praia","Ribeira Brava",
"Ribeira Grande","Ribeira Grande de Santiago",
"Sal","Santa Catarina","Santa Catarina do Fogo",
"Santa Cruz","São Domingos","São Filipe",
"São Lourenço dos Órgãos","São Miguel",
"São Salvador do Mundo","São Vicente",
"Tarrafal","Tarrafal de São Nicolau"
};

// 172) São Tomé and Príncipe (7)
static String SaoTomeStates[] = {
"Água Grande","Cantagalo","Caué",
"Lembá","Lobata","Mé-Zóchi","Príncipe"
};

// 173) Gambia (7)
static String GambiaStates[] = {
"Banjul","Kanifing","Lower River",
"Central River","North Bank",
"Upper River","West Coast"
};

// 174) Guinea-Bissau (8)
static String GuineaBissauStates[] = {
"Bafatá","Biombo","Bolama","Cacheu",
"Gabu","Oio","Quinara","Tombali"
};

// 175) Liberia (15)
static String LiberiaStates[] = {
"Bomi","Bong","Gbarpolu","Grand Bassa","Grand Cape Mount",
"Grand Gedeh","Grand Kru","Lofa","Margibi","Maryland",
"Montserrado","Nimba","River Cess","River Gee","Sinoe"
};

// 176) Sierra Leone (5)
static String SierraLeoneStates[] = {
"Eastern","Northern","North Western","Southern","Western Area"
};

// 177) Togo (5)
static String TogoStates[] = {
"Centrale","Kara","Maritime","Plateaux","Savanes"
};

// 178) Benin (12)
static String BeninStates[] = {
"Alibori","Atakora","Atlantique","Borgou","Collines",
"Donga","Kouffo","Littoral","Mono",
"Ouémé","Plateau","Zou"
};

// 179) Burkina Faso (13)
static String BurkinaFasoStates[] = {
"Boucle du Mouhoun","Cascades","Centre",
"Centre-Est","Centre-Nord","Centre-Ouest",
"Centre-Sud","Est","Hauts-Bassins",
"Nord","Plateau-Central","Sahel","Sud-Ouest"
};

// 180) Guinea (8)
static String GuineaStates[] = {
"Boké","Conakry","Faranah",
"Kankan","Kindia","Labé",
"Mamou","Nzérékoré"
};

// 181) Bahamas (31 districts)
static String BahamasStates[] = {
"Central Abaco","Central Andros","Central Eleuthera",
"City of Freeport","Crooked Island","East Grand Bahama",
"Exuma","Grand Cay","Harbour Island","Hope Town",
"Inagua","Long Island","Mangrove Cay",
"Mayaguana","Moore's Island","North Abaco",
"North Andros","North Eleuthera",
"Ragged Island","Rum Cay",
"San Salvador","South Abaco",
"South Andros","South Eleuthera",
"Spanish Wells","West Grand Bahama",
"Acklins","Berry Islands","Bimini",
"Black Point","Cat Island"
};

// 182) Barbados (11 parishes)
static String BarbadosStates[] = {
"Christ Church","Saint Andrew","Saint George","Saint James",
"Saint John","Saint Joseph","Saint Lucy","Saint Michael",
"Saint Peter","Saint Philip","Saint Thomas"
};

// 183) Trinidad and Tobago (15)
static String TrinidadandTobagoStates[] = {
"Port of Spain","San Fernando","Arima","Chaguanas",
"Couva-Tabaquite-Talparo","Diego Martin",
"Penal-Debe","Point Fortin","Princes Town",
"Rio Claro-Mayaro","San Juan-Laventille",
"Sangre Grande","Siparia","Tunapuna-Piarco",
"Tobago"
};

// 184) Jamaica (14 parishes)
static String JamaicaStates[] = {
"Clarendon","Hanover","Kingston","Manchester",
"Portland","Saint Andrew","Saint Ann","Saint Catherine",
"Saint Elizabeth","Saint James","Saint Mary",
"Saint Thomas","Trelawny","Westmoreland"
};

// 185) Haiti (10)
static String HaitiStates[] = {
"Artibonite","Centre","Grand'Anse","Nippes",
"Nord","Nord-Est","Nord-Ouest",
"Ouest","Sud","Sud-Est"
};

// 186) Dominican Republic (31)
static String DominicanRepublicStates[] = {
"Azua","Baoruco","Barahona","Dajabón","Distrito Nacional",
"Duarte","Elías Piña","El Seibo","Espaillat",
"Hato Mayor","Hermanas Mirabal","Independencia",
"La Altagracia","La Romana","La Vega",
"María Trinidad Sánchez","Monseñor Nouel",
"Monte Cristi","Monte Plata","Pedernales",
"Peravia","Puerto Plata","Samaná",
"San Cristóbal","San José de Ocoa",
"San Juan","San Pedro de Macorís",
"Sánchez Ramírez","Santiago",
"Santiago Rodríguez","Valverde"
};

// 187) Cuba (15)
static String CubaStates[] = {
"Artemisa","Camagüey","Ciego de Ávila","Cienfuegos",
"Granma","Guantánamo","Havana","Holguín",
"Isla de la Juventud","Las Tunas",
"Matanzas","Mayabeque","Pinar del Río",
"Sancti Spíritus","Santiago de Cuba"
};

// 188) Cyprus (6)
static String CyprusStates[] = {
"Nicosia","Limassol","Larnaca",
"Paphos","Famagusta","Kyrenia"
};

// 189) Malta (5 regions)
static String MaltaStates[] = {
"Northern Region","Southern Region",
"South Eastern Region","Western Region","Gozo Region"
};

// 190) Iceland (8)
static String IcelandStates[] = {
"Capital Region","Southern Peninsula",
"Western Region","Westfjords",
"Northwest Region","Northeast Region",
"East Region","Southern Region"
};

// 191) Ireland (4 provinces)
static String IrelandStates[] = {
"Leinster","Munster","Connacht","Ulster"
};

// 192) Luxembourg (3 districts)
static String LuxembourgStates[] = {
"Diekirch","Grevenmacher","Luxembourg"
};

// 193) Liechtenstein (11)
static String LiechtensteinStates[] = {
"Balzers","Eschen","Gamprin","Mauren",
"Planken","Ruggell","Schaan",
"Schellenberg","Triesen",
"Triesenberg","Vaduz"
};

// 194) Monaco (10 wards)
static String MonacoStates[] = {
"Monaco-Ville","La Condamine","Monte Carlo",
"Fontvieille","Larvotto","La Rousse",
"Saint Michel","Moneghetti",
"Jardin Exotique","Les Révoires"
};

// 195) Vatican City (1)
static String VaticanCityStates[] = {
"Vatican City"
};


	  
	  
	  
	  

    public static String[] findStatesByCountry(String countryName) {
        if(countryName=="India") return IndiaStates;
        else if(countryName=="United States") return UnitedStatesStates;
        else if(countryName=="China") return ChinaStates;
        else if(countryName=="Japan") return JapanStates;
        else if(countryName=="Germany") return GermanyStates;
        else if(countryName=="United Kingdom") return UnitedKingdomStates;
        else if(countryName=="France") return FranceStates;
        else if(countryName=="Italy") return ItalyStates;
        else if(countryName=="Canada") return CanadaStates;
        else if(countryName=="Australia") return AustraliaStates;
        else if(countryName=="Brazil") return BrazilStates;
        else if(countryName=="Russia") return RussiaStates;
        else if(countryName=="Mexico") return MexicoStates;
        else if(countryName=="South Korea") return SouthKoreaStates;
        else if(countryName=="Spain") return SpainStates;
        else if(countryName=="Indonesia") return IndonesiaStates;
        else if(countryName=="Netherlands") return NetherlandsStates;
        else if(countryName=="Saudi Arabia") return SaudiArabiaStates;
        else if(countryName=="Turkey") return TurkeyStates;
        else if(countryName=="Switzerland") return SwitzerlandStates;
        else if(countryName=="Poland") return PolandStates;
        else if(countryName=="Sweden") return SwedenStates;
        else if(countryName=="Belgium") return BelgiumStates;
        else if(countryName=="Thailand") return ThailandStates;
        else if(countryName=="Ireland") return IrelandStates;
        else if(countryName=="Israel") return IsraelStates;
        else if(countryName=="Norway") return NorwayStates;
        else if(countryName=="Argentina") return ArgentinaStates;
        else if(countryName=="United Arab Emirates") return UnitedArabEmiratesStates;
        else if(countryName=="South Africa") return SouthAfricaStates;
        else if(countryName=="Singapore") return SingaporeStates;
        else if(countryName=="Malaysia") return MalaysiaStates;
        else if(countryName=="Philippines") return PhilippinesStates;
        else if(countryName=="Vietnam") return VietnamStates;
        else if(countryName=="Pakistan") return PakistanStates;
        else if(countryName=="Bangladesh") return BangladeshStates;
        else if(countryName=="Sri Lanka") return SriLankaStates;
        else if(countryName=="Nepal") return NepalStates;
        else if(countryName=="Bhutan") return BhutanStates;
        else if(countryName=="Maldives") return MaldivesStates;
        else if(countryName=="Afghanistan") return AfghanistanStates;
        else if(countryName=="Iran") return IranStates;
        else if(countryName=="Iraq") return IraqStates;
        else if(countryName=="Qatar") return QatarStates;
        else if(countryName=="Kuwait") return KuwaitStates;
        else if(countryName=="Oman") return OmanStates;
        else if(countryName=="Yemen") return YemenStates;
        else if(countryName=="Jordan") return JordanStates;
        else if(countryName=="Lebanon") return LebanonStates;
        else if(countryName=="Syria") return SyriaStates;
        else if(countryName=="Egypt") return EgyptStates;
        else if(countryName=="Morocco") return MoroccoStates;
        else if(countryName=="Algeria") return AlgeriaStates;
        else if(countryName=="Tunisia") return TunisiaStates;
        else if(countryName=="Libya") return LibyaStates;
        else if(countryName=="Sudan") return SudanStates;
        else if(countryName=="Ethiopia") return EthiopiaStates;
        else if(countryName=="Kenya") return KenyaStates;
        else if(countryName=="Tanzania") return TanzaniaStates;
        else if(countryName=="Uganda") return UgandaStates;
        else if(countryName=="Nigeria") return NigeriaStates;
        else if(countryName=="Ghana") return GhanaStates;
        else if(countryName=="Ivory Coast") return IvoryCoastStates;
        else if(countryName=="Senegal") return SenegalStates;
        else if(countryName=="Cameroon") return CameroonStates;
        else if(countryName=="Zimbabwe") return ZimbabweStates;
        else if(countryName=="Zambia") return ZambiaStates;
        else if(countryName=="Botswana") return BotswanaStates;
        else if(countryName=="Namibia") return NamibiaStates;
        else if(countryName=="Angola") return AngolaStates;
        else if(countryName=="Peru") return PeruStates;
        else if(countryName=="Chile") return ChileStates;
        else if(countryName=="Colombia") return ColombiaStates;
        else if(countryName=="Venezuela") return VenezuelaStates;
        else if(countryName=="Ecuador") return EcuadorStates;
        else if(countryName=="Bolivia") return BoliviaStates;
        else if(countryName=="Paraguay") return ParaguayStates;
        else if(countryName=="Uruguay") return UruguayStates;
        else if(countryName=="Guyana") return GuyanaStates;
        else if(countryName=="Suriname") return SurinameStates;
        else if(countryName=="Panama") return PanamaStates;
        else if(countryName=="Costa Rica") return CostaRicaStates;
        else if(countryName=="Guatemala") return GuatemalaStates;
        else if(countryName=="Honduras") return HondurasStates;
        else if(countryName=="El Salvador") return ElSalvadorStates;
        else if(countryName=="Nicaragua") return NicaraguaStates;
        else if(countryName=="Cuba") return CubaStates;
        else if(countryName=="Dominican Republic") return DominicanRepublicStates;
        else if(countryName=="Haiti") return HaitiStates;
        else if(countryName=="Jamaica") return JamaicaStates;
        else if(countryName=="New Zealand") return NewZealandStates;
        else if(countryName=="Fiji") return FijiStates;
        else if(countryName=="Papua New Guinea") return PapuaNewGuineaStates;
        else if(countryName=="Samoa") return SamoaStates;
        else if(countryName=="Tonga") return TongaStates;
        else if(countryName=="Solomon Islands") return SolomonIslandsStates;
        else if(countryName=="Vanuatu") return VanuatuStates;
        else if(countryName=="Kiribati") return KiribatiStates;
        else if(countryName=="Tuvalu") return TuvaluStates;
        else if(countryName=="Nauru") return NauruStates;
        else if(countryName=="Austria") return AustriaStates;
        else if(countryName=="Denmark") return DenmarkStates;
        else if(countryName=="Finland") return FinlandStates;
        else if(countryName=="Iceland") return IcelandStates;
        else if(countryName=="Greece") return GreeceStates;
        else if(countryName=="Portugal") return PortugalStates;
        else if(countryName=="Czech Republic") return CzechRepublicStates;
        else if(countryName=="Slovakia") return SlovakiaStates;
        else if(countryName=="Hungary") return HungaryStates;
        else if(countryName=="Romania") return RomaniaStates;
        else if(countryName=="Bulgaria") return BulgariaStates;
        else if(countryName=="Croatia") return CroatiaStates;
        else if(countryName=="Slovenia") return SloveniaStates;
        else if(countryName=="Serbia") return SerbiaStates;
        else if(countryName=="Bosnia and Herzegovina") return BosniaandHerzegovinaStates;
        else if(countryName=="Montenegro") return MontenegroStates;
        else if(countryName=="North Macedonia") return NorthMacedoniaStates;
        else if(countryName=="Albania") return AlbaniaStates;
        else if(countryName=="Estonia") return EstoniaStates;
        else if(countryName=="Latvia") return LatviaStates;
        else if(countryName=="Lithuania") return LithuaniaStates;
        else if(countryName=="Belarus") return BelarusStates;
        else if(countryName=="Ukraine") return UkraineStates;
        else if(countryName=="Moldova") return MoldovaStates;
        else if(countryName=="Georgia") return GeorgiaStates;
        else if(countryName=="Armenia") return ArmeniaStates;
        else if(countryName=="Azerbaijan") return AzerbaijanStates;
        else if(countryName=="Kazakhstan") return KazakhstanStates;
        else if(countryName=="Uzbekistan") return UzbekistanStates;
        else if(countryName=="Turkmenistan") return TurkmenistanStates;
        else if(countryName=="Kyrgyzstan") return KyrgyzstanStates;
        else if(countryName=="Tajikistan") return TajikistanStates;
        else if(countryName=="Mongolia") return MongoliaStates;
        else if(countryName=="Myanmar") return MyanmarStates;
        else if(countryName=="Cambodia") return CambodiaStates;
        else if(countryName=="Laos") return LaosStates;
        else if(countryName=="Brunei") return BruneiStates;
        else if(countryName=="Timor-Leste") return TimorLesteStates;
        else if(countryName=="Taiwan") return TaiwanStates;
        else if(countryName=="North Korea") return NorthKoreaStates;
        else if(countryName=="Malta") return MaltaStates;
        else if(countryName=="Cyprus") return CyprusStates;
        else if(countryName=="Luxembourg") return LuxembourgStates;
        else if(countryName=="Liechtenstein") return LiechtensteinStates;
        else if(countryName=="Monaco") return MonacoStates;
        else if(countryName=="Andorra") return AndorraStates;
        else if(countryName=="San Marino") return SanMarinoStates;
        else if(countryName=="Vatican City") return VaticanCityStates;
        else if(countryName=="Bahamas") return BahamasStates;
        else if(countryName=="Barbados") return BarbadosStates;
        else if(countryName=="Trinidad and Tobago") return TrinidadandTobagoStates;
        else if(countryName=="Grenada") return GrenadaStates;
        else if(countryName=="Saint Lucia") return SaintLuciaStates;
        else if(countryName=="Saint Vincent") return SaintVincentStates;
        else if(countryName=="Antigua and Barbuda") return AntiguaandBarbudaStates;
        else if(countryName=="Dominica") return DominicaStates;
        else if(countryName=="Belize") return BelizeStates;
        else if(countryName=="Benin") return BeninStates;
        else if(countryName=="Burkina Faso") return BurkinaFasoStates;
        else if(countryName=="Burundi") return BurundiStates;
        else if(countryName=="Central African Republic") return CentralAfricanRepublicStates;
        else if(countryName=="Chad") return ChadStates;
        else if(countryName=="Comoros") return ComorosStates;
        else if(countryName=="Congo") return CongoStates;
        else if(countryName=="Djibouti") return DjiboutiStates;
        else if(countryName=="Equatorial Guinea") return EquatorialGuineaStates;
        else if(countryName=="Eritrea") return EritreaStates;
        else if(countryName=="Gabon") return GabonStates;
        else if(countryName=="Gambia") return GambiaStates;
        else if(countryName=="Guinea") return GuineaStates;
        else if(countryName=="Guinea-Bissau") return GuineaBissauStates;
        else if(countryName=="Lesotho") return LesothoStates;
        else if(countryName=="Liberia") return LiberiaStates;
        else if(countryName=="Madagascar") return MadagascarStates;
        else if(countryName=="Malawi") return MalawiStates;
        else if(countryName=="Mali") return MaliStates;
        else if(countryName=="Mauritania") return MauritaniaStates;
        else if(countryName=="Mauritius") return MauritiusStates;
        else if(countryName=="Mozambique") return MozambiqueStates;
        else if(countryName=="Niger") return NigerStates;
        else if(countryName=="Rwanda") return RwandaStates;
        else if(countryName=="Seychelles") return SeychellesStates;
        else if(countryName=="Sierra Leone") return SierraLeoneStates;
        else if(countryName=="Somalia") return SomaliaStates;
        else if(countryName=="South Sudan") return SouthSudanStates;
        else if(countryName=="Togo") return TogoStates;
        else if(countryName=="Eswatini") return EswatiniStates;
        else if(countryName=="Palau") return PalauStates;
        else if(countryName=="Micronesia") return MicronesiaStates;
        else if(countryName=="Marshall Islands") return MarshallIslandsStates;
        else if(countryName=="Cook Islands") return CookIslandsStates;
        else if(countryName=="Niue") return NiueStates;

        return null;
    }

    public static void displayStates(String[] states){
        if(states==null){
            System.out.println("No states found");
            return;
        }
        for(String s:states){
            System.out.println(s);
        }
    }
}
