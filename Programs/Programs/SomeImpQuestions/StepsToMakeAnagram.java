package Programs.SomeImpQuestions;

import java.util.ArrayList;

public class StepsToMakeAnagram {
    public static void main(String[] args) {
        String s =  "dfldbsfrhsdtjqmqlfxhlhmtiuafqfqaollecdejisdgingxjsmhflxjwczqpnpuxdnhxgcdkachwgncnwpybpopflbircnynsyeerrexxeikmjcbimkwmjlqqovyzdsatrowsqxbinyrhvkjhuzbfqachymwysdobxdjinjueurgbcnsdmhlizlznqxswjgnukgnisgrdlzhgldrcjrhwbvwoutdllpxlntmpugwlttqjjkcsuwqfkslfavardlgiinexjvitldgsdhszydkkktnvkjoruzfsmruqiqpjkwiwwlhrekgljflhazbdkvgsvntaytdldffixclllpygtifzkhllsbrqsgjmzeagkxygdvvejjlcuyrrqdmiefhooozrwfrgjovgluqpbzmpizhdjieyzcxtwezzqpgnsixpcfvdluhvwtxmassmojsykfskqfpvvpznqyvgilpdhhofzdybqnopvaassnlyedrhkkcvlgouvxpbqnaknxwmoukyobpctoovambtjohxjzochgcaccvczdcamyepsuxjougcrhqsvvesdjuvbnhgshwwhorchgdbsnpixxzrdbxoqzxzrmlfqkzjmkjxrntkqbkntmuomvrvzvmtbrfyxilpaikzuzcfypurnqaymywapadnpznopxgpjtystizvyoysnewcdddwfqbpprtqcjyjzgovjiepdsaxslygcshdawrbvgktubplrvfvltuxffcvaogihfvhnvgpshycexbopdebqepuctlrhzzcbgbchcyukihrmsghhcflmhfigohoswmsgeblutmaqtbufshtajgtpakqrfwvwkeftdhmejofxxxvacuijysfkoiygescizgxunewrkxboxqzepzhstkpsdstrlyfndgpojvqttqrxinpqrwarzceyrabibqtxmsrcpkizxqdfdhjkwwufbqltxlnfomcjtpsovxeorjbuatjqyxyddnlispyffgmmhoistwgwupefpfautpxoqbmbxsqzgzntmfufnsnnqpfbdljxiucjiatnuxfcelxeliukyiemdvczcfyqncbghvrixrlxkvxhomsvgvvxxdcaemgnxmzcepcgxsqzacmmmsasqpqifmzeprovhzbufldybvkonqniaicsgosgelvvbydogjnvlrjwkrtvrrjjlqkttosmlrkihkyzfdpbeoholemkbwxhyhmguspfukmpoojjknwgtwscklvarlnulcaqbaysdzgbfqnoictwzknqzqfqpkurqwebexvdwfroxlqqrwiepvthvsaefmrbsiiakrseofrgrfloospqnzmvtrtttyhafgzrufnagqjblgibbisyovdgenrmozduahsuldgdoiusfrqrvbialfadefzjmdrdszgtlslnasftvkqmziaiwralwaccawwonagczpjshrtiyssrkccywdmtujzqmzppfrwqjolvdxjutajkzvmipoftvphidutihwplqzaiqtowjqtxasetohiqceyehiwpanhnumqnazpcbkeyxqvitbmyrtleceolqjlitwrermlnipxduacycebikdsdlcdliuyyixilhkdwdkckwgtthribovxlnukvftlsrcxvlffjuobbvufmujjxzbauafblpkbeqfjwdrnjjrqmrqtuvjalqhsskeaaducrzifytguzsdjvwklzbyqghtlmdnbmcirekqlfzjucpxuuuvvftilfixhahlzogrronpoxgssgvwasgdkfrryevmdhqaahkwsvlxqeavcaasyaqafvuoweqavtumpyunmrsdoviarievhyyenqlhhtluixqyqgcdnyeujxftxzxqlyleykhwdeooznuwctydozbjyuiblprkjbjjrhpbpjvcmlfvfvvabhdfyuojkewnqgeyqrtvavcaueihkzpmdozdufklytyxprwyyzgqxsvuvaxoffwdmwtbisituddmlphkavgmuqvlmfklnhknuzdgxedzuoaphlcfcwmekddhogvetjxfrdputsnrujcgnkriptvxlylowhrdzkxpguyvvnkojlcyenswgvwkdzwhbipstukysnkmlrlszkpmvvhsjktjhsbukcrhbbynkstoxajjlmfriotsaohrohvsrgdzudtjnbnwqmnoiskaqukjodclebeccrqyefdptdwvayftgkwmpgdomnfpdylqvdntnabrllfesnwhlppevoxdmlipfcxtxzojspiyuwwwooufkrrgetevyvjdufwqmzyembvwnbozyqiqrkhcsymbufrkaqlswsngqasxqqtytablosfswdrlieqnoxnngawcmlfxejjnefpwmqtlqwgpnkvkgyplbyqmjrfgrzskrjzjjxbivrmocrowrlfepgpmlrcdxcgbjeqgvcavijymqlawpmqpsnmawbgyzgwvhmtlmjsvljnmbuqluxfrjcgxklxlxasyevbjggdjxilidrgydsiwxcjmyeryghszuglxeiycydaultkwelvtuefvmgovgobgxxzmqszrqqpovuzldeoibwkofetthvgzgzksvoazuupxrtizsqijnlqajhasdfhwrtcsmqzbqldbtnbgtbraemcxwbstyebpjlnpajicgpddlllcmmzclefesigwkcrzanwkfyqrtgafrayfqguveylaggxmdniicgcviuoqqkgwthvjnbadhzozbirbkkakujcutsamwnhsodagmeczgugkecjchjjexdtliafpbzcdatqxxktlzgzhdmvmmluktfessoyitppzkquujtzkvpveezsibikhembfxhwljjiumcchfbpfbaxmicljzqozkdovptmyzojfajbhpzjulbsbvvjmwincxfxqdhdkrcwdfkezhhbrkcbyciwhsyhmhkfugibcvmhsospemulunbbyisnintovhnjxmpazjbvcnqbdewslextvcwfaelfrfwtyfyxrbfencvnkzymblmydkyvycdxaaedwvjozubckddtpfmdyzijtnmqahyvsdlojsvzfenxlznwnkcxnbzgmiyoulnkexzzhbsykqxoifrofrablgctwmtnmgpmpyvzbxgsbcobniwvfzhznxphdgsfqimkemlalqbagdawkcolegbqssfgpldezlmqebrocluhjyshtsphvsatmshevlpkissjfwbpznefzfolumbkigslfimvxbygcuwbtvwzindaqjyctdylgbajlbeljkvbwjmffaaodsepzokigkjyuamdbhrrgxlxarxfpsjyfxpwcjuavmzhrfloemrjxkqznoijrqgghimyrvowjryrkyezyaxximjwdmknfitmwcdqpfgczxjnxrymyuipwvbtobzsihbadumtkntcvricleqexpxpzoiytyskyrgscejxpvdtjwnujplbfknhsfrcgqqsfmlvawfmqolvrgjminijzsdxgpreyswesdoljgdtiisvhulcibzbwineshpboizbbwrfnkrbwlozomnulxfygahhxmnsrwwjrgbqcibhzpgvvnrsozdhfgtfyhhwubzuglcbhusmjyredjgdnwdngsldhuxkvkcvmghuxcixuttddugolhconubcnfygvpelnkkiotslfeleoqjuigieayglmgtqffnwgplkhvfqglckjhslkwgytcjgfbaugdjapmkhrpaptejxgvlaxkfmqfqxdvhhhgmrizttbnvubinoisizikocxnwbxzpppzkuwdrwixkzlawtxrwuznlrehlszutrtfwcmfhbmcrwltutwxwvtmaulybwuwcwbqkoejmedmjykwbsdixybtumadabiapfsvfrmxjjuvsdgmcdumbtyvzwzfwylzlgznxvkslfsxxuzqinwgketmoufkpmquqxalqvfzkdmjsawhquftqjwvwgkuttzrqihuqjeqpfckrwyeytidsrckhjlenmyfvajrdwwuhhbijixeycbwnqsnkgrlowswsktqxsirreiwxplljhzlautzzacnihuoezcuqzazxrbwuedlwkkeowsvxaxexfackisaodwymhqqnaecikknqtazqlpopqcwklhhnqdcjohppocusodtslnxxfgrnipjeddjyvlhfwwphwqmdhzoaprglevcjhpewyzhpxtioupxalkglswyclevsjlssrvkprolkwixwhfwogmmpbckxoqiapsexznpydezkaobrbjjdqonmpkjqedhrlplnitskotjqjdxafwpahopddxwqovqvthcgmrywqvrxlswizcruwfvgpbsldwizowdbkqdzlbhvekxusukglnikbyclezmhhpeeobehdyekpuykkrryxzrgkvxziahazyrfcbpqpbmnzgbifkirgmbnvqwvxaoxyvptszrpvgmyihoqwgnkpmcblgobgqcwbxwcaanbudjtsuxzrnocnckzbfortrjqimbmpptxxslsfnabxeuqlvqecaighwcxkjbilxhtpnxlrjahjmcoczcfsomohzjnfrwhuwkefeimbazgeherazhuxbalegwfzwkezcinphbsctzsorxorqjbibgmsrxvhpdtdeciedhgsihurxyolyvpxjkhsyswyvuljohsdlsoekonsxgeeraxwtnodwrsysabfblachvvtygdyswokmbouhowaawbajhbfwwizzslgnfppdadczprvbjkmfdvrnocgszqmfgnhgbfsifehheigxpugdxroazdlywwzqkcgvcbgcggmdrnzbgjpnvvkbaaumsnmoatprknswiimfqxrzvlxwqcdpvlvsywjillkknprroinwidajhvmqvtnpgenwbekbsvkwexfikrtuhpowbdovnqkuofvqylsqbajxpcorsoqnghvypmblsnrfjcgtxbvdtbtqmtmepkigqfxwhczcaenumvjjsarfwgsuxmwxqotyviegaxdpybnzolephfsqbdlojuitcwjvxrqeszcjknpszpfzeitlkbnpryyncyuofkgklinynpxidfhhwuflycehkdartfzbgltdtarztkrdcitzwtvsgfgbuiajtlihrnntnbvadmunrtwsayfaxvqzquazqffdwydxaqwshsyyqborrfxgxdhgurcpsafuqrxqbmvlgabxdylyoejtyujoaqhiitycletftlkewuhxktezgkoqpisnhizresocgagaaovvqeoisoxiqbuvqtoazggstzbridedxmeywqactutubmfrjdgeqkfrknueehskwbrnrikclwivegkqzqcllrfdbdynad";
        String t =  "egsvyubzbavspucpzmflmaqhdhjfuppbdsqpkvdflwnhmizfzeuhxzhxnmaemclxlbttmdkkowrzzjaxgndspicmtpmtmujhingjxiqtnguxapiwsylmccyxawrfdpwzvsqkwyaeoylbwkcqpsgiufzotczsruystmlcltrzizvaifretyylnufrdzshmrjhevbxirendmxnhwslccgaylwkvkcdzkdegmxzmcwecqtkjtumhhglsmvjkfhpbrwdxeqobgfrqptprtiuvdavmjjeyevpsgkexrqwhiezdxmxudccbqwlompvnthchspgxhvqfcflyifaehobetriekipronabyrjparwwcaiesttnniluovbrzlfbemjgriihywngbwllvkdckoajuptgmvjdmjxbxlwjcnqkxkfcwrhoqzqbnjvvctybgzhebladhvnqrvnmvarxcpefeldgjztehxtvxaqwaxavscfygcwjrwmtbqiulakzimwmdcfelprkpthppgbohnghysozqutvohloxzmktdprclhliqpsbjlzdbcydjjaxpmesuqjjjlfuvujmmwewikqxptripqvnwzhhfqyuroqntgjttmvigimpyeayupvyhyyttbfkkioddhskvyagrtylyxwtkztkejejdpxetcxaswvoqksiuveurndkqqwuosonsvrqptcbigpwtzuqbcdhvwxdgqvceetlmcmyyufrszolhmwlewlhgamsqvjkorkmktjeusvwcaukphwlohovstcxwkeewgdvawjceagzbbamqjgkwqpebccscjmiztmtgorhffgzgokbgwydubtxzczbbuggzduwiejbsledbkiivdihzeddmacxoosffylahiwpwhffaxlfgirtuofmigtmogobijddpdclsedbgcxkdnktkhobwsnrxravwwdkliyuawvzoufypeaktuateuxwumcjiqijolyxbbnnvvvtmmwzbnnaiyydvjyjkuadxqnomphppmsyeiyuneegfdguxvnrprajemtpfjtobdovoauoohmnusebmxlisosupszqrpldnfrktkbijipkmtilnyyohcrcetbwrpvrxikfyowavbccnpjxhnkcuyivngdactnoscopqdouvigfiqslsetyldvjxlfobvoekffiialkrriaazqntecjejjwqfpelxwhdkufopvfuprmhfdfdcpxvnkxxehgqtgfnvxwcvidtjtyuimznkakjwtcunhednaoufwxofkrztvehvwbzmuijlccpojjnvgvnyqiavffkdllmdkfdebmkucinoknpvjlmxvjvlurmdwsnbkhtylkluvpiuupmiklchgvetsndkhyuztajvanukkbgprhizyawszftjtxqmhsgmeeypijsapmgyljnjptuuimqhzikrdqhambidbkmjjwzctkasmibxxyvhuuxzsvghmdabgfzfangvszacucpcsazxworrqlxtsphoaisuqeulxvvmoncganpjtzzkszvyxupmrdporeywruoewrumcbeexjyjliqmeojygdzzkeyrzcymyyojbaatuuxikvfjobiscjkgelflmowbrefppiqnnwexrhnusftpavvmsrpaxoeyqrvtzmowliwzyxkociaskcuxvslhhcqazwnwbnnozzwumkmelilrneyxgivszpocwjbonzkubghnvigkxdkmaaflsyewpwzvwyglsetwezkmvnwtwnvrwvwtcvagwbjrhalillrggpwbgbbvzwroebfcngzginwfimdsyhyexbfvnsbduzmryuftzxorygoojbvxjhveigtsneqbajwspvdorhrothprnzevjxtquxqdxylqncjydxnolyedaflsuajdvrlrbhuxebezajbpihkzwydjqftqddzrdmxkpviogqlixsmmbotqprtuwphomcgzgcxrrndpbhjjdobvinfuuuuiijvsgqkqyfkmczqxzzlfriwcfwvbutfbjuyvzldncrxxuegbznmfemmasilyrvtfuhozrcrlubplrfvjwxjxtbmkdtvfqrwcvmzwgeqkmspoqvfoqynwoodojcurnarypyrmiwmsflwqzwjhroxgcweoizphxomiwpmeoljvvqjaigaeisdgfzvavzkormqpiqnsfikjfozdbskikyjilpdckesdzofppxvttubxzfrcgyrxjmcoxiutgijvzznokropmowmxhsgroizatjxkfhonsknldmcdlqkfkfzpgavdflksbeavuvygprozzweqttxvqkpfhuessupnttjgrzzpagrlytqimfoysplbpfeglqglevoicelvracimdeedltzxrsxmzqzlfuhvlswdefeiswejbkoauepgdswhghpngdwuwaurpfooafvkhmnruoppacdawumvdbuhtlcrojsvhctllcqyhveqdlxsuvtsbfpzkdureohqhetdspgsesugzlhuchfapdnkvsmoxejlwdfdttctzutgcvzntvpbbmhkxwnkuqulzecprugglvddtobupxtdehjfexgzdccxpvhjqhsrwudgxrkqzogdqvbtufqzahbvsopimoxjfkcdbcuyzpvxechnmgorsqhvuqjsrxltvtdhenaedqiyrkqqrnmjauzxlvwpneljldhuwyivycswxikeuhryteshikhwbferwubvgquwnpkuxvwfrntgwmsdrxntmqhmixowgmjfhdpelmwxvexejjzdaejnuzudutmwchomqmaxweqbkeiggxtdvoqfjzbeupvwshyxpxldbmyqsxggcxrrdlkpiqexuynfwdhcgqxbxqmtobhtgadnyismymwiegxziewqzocxpnvhwobbosksetawykszgupuqqqguodkcqvwjlzhnubhktnrnfcvzcopibujivqxzfkuwxtzlrxenneieacrjbuqhkjolugyklnnrdikxqpdeaxqogqkdjoffkmyenwaqvjyutaauosfrxkbieamqdmrgdtugltnsbubioizubjcgusigltnblrrmotrkodlltjuhgbtbxnaajxefzdttveazkacbwqfzwvrtlsgapwdgxkceammbjphipxvrimuzbulyrmgblgddxgeobdthlzmdirdlqcyyzkxzluftqrtbeungknlglhvzcrslsbwmaofugaazdisneeubjujhjymfldddejtzpfokxwbsinrrcodtzetzdvfzortcyrzexkhqlojkwnqiyipdvsipkxuviefczyiaykanrofifcwnsaoqavxguhtxtmhfywqjwxgbhyumbdxknpprofszzlsaovjbphgpyturqqijtdeubxytzofrvinwojuipjkdosyhpgopdrjsvxzraaywurkibkfktzjlfxbitesafuazjjzthlnnyehyiadaderxbixgjgfhvmpevodekaqguspffyspflxhuqafbqtowohiyzpgrcynjlxbnniglqcdqqysiajbhdbkokmkzxpbpzbnimiwferplopfiaqwxicimwmdnsdktpvfvjxtryqsssewpeabavwbemuutgdkbbyyjqdqiwggbvggsmxysaqyzgwsdximdhyzxdbiedgubjqivpltzjcrhuzinwtyvimyelucqshauimcuqqegitmziaxpnykyufiejnkuswziiajkcaxznuxtqzzekbkwmihljnqovbnlcfqmqaqdvzwaosiwaxdpdrwxbpsdepbwfwtbgonbatjnmtvzxpyeircvemrlnrrhtggkrxewulvxnfifyxdhcuexzybvdapllcvhvpxinhkhzalumpcabfwdlkseeewkosrgksdbtlhilkjneuxrwthygonnzxhvyugywvyvzzqjtjhsaaqtaktnzxpxgeggctlelcwcromwpywcwipmmugqyruzakdxrruugpxsmtnrmrfgkscwrjwooxtsbfudlmpcweiotxdaiqbxmthfwbvrlynkhxvrkzdnnolrpbthsnrdbztutcoyzrbsjdhzbkridxnzcpdjuvyfeowpnpjusrxzppffbddvvzbrbbxemoibijvrclidmohhygtmyhzrmdodwqgfcupqetbbpeszfjxjkzjtvtqecsjihyllpummuxvvicnighvfewrcwpdldlhzzqimtfodfokeodiumqgcmaomabwalghkotrjvgxabqwprffjlnbdlsxrorzajcembysgbqitmftxndllxgkbyqtwnrcdvtmpvkwwxpdfzjohtpiutbhjvrkwdlxfrwczoapdmdahgvymfcpdqtztssejdoaxlbaqkzvhonzqbqytatkrilchzdapctkhnjntxnjuduuojmgcfpglpnvkfihumuinciziukscsksiopfrfhawrifvjjybecdoqqqxcoidsbdqaocilqpjhqatladwtbqddmcubgruflasaowogwcbhpxnearxuqybhhohtzjylagkeommcubolqcwymxvurzvohzohnmtxrldnjnglgjgignroakvxjuopnicdlwbpbphmkcnvhrxxucinidbntjwsyfzbaunaegwvexcgbscqtlyiaqkjcpqtwbnjsgkzhfpujegudidjrdmfrvtrqiozzytonogfqrhpobkiwabrelzgowqicilqsjsdoukjjaddijtejuglpxmwtkvwanysrlyoalwimbjevepxpgosvqfgnjcottdnjblcenhmcwiadimcyryosslsrnelndpitsefxlfvqioztpgwdbkhuqlrlwerovoowkmapzilpmhrbdgvblwqlagoskaysmsizghopjpgaiaghrucfjwzbrmpjnowvkntiprscmlshtpjjydlkiftqncywhitidxhhvanzmjncahposaxfnfvhksrkruhvogzvtoszpiehktknqlvtehyvjnhbeijhanvmhecmvwjkdguwzqrcgworrbnpmvkvprrxaqjszjbbfphirfltgejimanankfqxrxccexahgwxpnvqhsfilubvtiinkltuyhyeiggnhqqulfruinlxqrdqeawiwftgwgxuottiybizijebihwflhffdlixihlcurkbpsqydfdlhlguumcwqvlfmkrooggkyqdikdqkytskggbwsixijttovcowazpgvuesunkfxceeeylcdovmerhqjptdoerbeapznmwbmczjrduizxlnvhlbevpqiyerixhpogkxmjtbfatvbnzrnkckhjoyijfabbtoxdkcttbxnbxngjfzmenzwbvxvuubqvemugxfvaxwldlcv";
        ArrayList<Integer> list = new ArrayList<>();
        int j=0;
        int i=0;
        int count=0;
        while(i<s.length())
        {
            int index = FindIndex(t,j,s.charAt(i));
            if(index!=-1)
            {
                if(!list.contains(index))
                {
                    list.add(index);
                    i++;
                    j=0;
                }
                else
                {
                    j = index+1;
                }
            }
            else
            {
                count++;
                i++;
                j=0;
            }
        }
        System.out.println(list);
        System.out.println(count);
    }

    static int FindIndex(String t, int j,char target) {
        for(int k=j;k<t.length();k++)
        {
            if(t.charAt(k)==target) {
                return k;
            }
        }
        return -1;

    }
}