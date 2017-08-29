import React from 'react';
import {Link} from 'react-router';

// *** PAGES ***
export default class FaqPage extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div>
                <div className="container-fluid">
                    <div className="row">
                        <div className="col-md-1">

                        </div>
                        <div className="col-md-10 text-center">

                            <div className="panel panel-default">
                                <div className="panel-heading"><h2>So what is this website about?</h2></div>
                                <div className="panel-body"><h3>Our system is a real estate investment portal based on shared economics.</h3></div>
                            </div>
                            <br />

                            <div className="panel panel-default">
                                <div className="panel-heading"><h2>How can you earn money on this website?</h2></div>
                                <div className="panel-body">
                                    <h3>By purchasing a sharehold via the current collection process</h3>
                                    If you purhase a sharehold of a real estate your Shareholder account activates from where you can follow how the
                                    collection process advances and also comment on the possible real estates that we will purchase.
                                    If a real estate has been bought, the income from it will be divided through the Shareholders according to the
                                    percentage of the shareholds.
                                    {/*Amennyiben részesedést veszel egy ingatlanba aktiválódik a Shareholder fiókod, melyen keresztül figyelheted hol tart*/}
                                    {/*a gyűjtés, valamint ha már elkezdtük keresni a lehetséges ingatlanokat egy felületen véleményezheted nekünk őket.*/}
                                    {/*Amennyiben az ingatlan már megvásárlásra és kiadásra került, a belőle befolyó bevételt a Shareholdjuknak megfelelő*/}
                                    {/*százalékban szétosztjuk a Shareholderek között.*/}

                                    <h3>
                                        Selling the already purchased sharehold on the site
                                        {/*Eladod a már meglévő Shareholdodat az oldalon*/}
                                    </h3>
                                    It is possible to buy a sharehold from other Shareholders as well, that already started paying their
                                    owners, with a price that is 20% higher than the original purchase! If you sell your sharehold you can do
                                    that for a <b>price higher with 15%!</b> (We get 5% as administration fee)
                                    {/*Weboldalunkon gyűjtéses ingatlanvásárláson kívül lehetséges azonnal is Shareholdot venni az*/}
                                    {/*eredeti árhoz képest 20%-al drágábban! Így ha eladod a Shareholdod az eredeti árhoz képest garantáltal*/}
                                    {/*<b>15%-al drágábban</b> tudod ezt megtenni! (5% szolgáltatási költséget levonunk)*/}

                                </div>
                            </div>
                            <br />

                            <div className="panel panel-default">
                                <div className="panel-heading"><h2>
                                    How can you invest?
                                    {/*Hogyan fektethetsz be?*/}
                                </h2></div>
                                <div className="panel-body">
                                    <h3>
                                        Joining the collection process
                                        {/*Gyűjtésben való részvétel*/}
                                    </h3>
                                    The minimum purchase is 100 000 HUF
                                    {/*Minimum befizetés: 100 000 HUF*/}
                                    <br />
                                    We gaurantee that 6 months after your purchase:
                                    {/*Vállaljuk hogy a befizetésedtől számított fél éven belül:*/}
                                    <br />
                                    We will collect enough capital for purchasing a real estate
                                    {/*1. Sikeresen összegyűjtünk egy ingatlan megvásárlására elegendő tőkét*/}
                                    <br />
                                    We will gain ownership of the real estate and set it up for leasing
                                    {/*2. Tulajdonba veszünk egy ingatlant és kiadásra kész állapotba hozzuk*/}
                                    <br />
                                    And after we will divide the profit among the shareholders
                                    {/*A továbbiakban pedig kiadjuk és a bevételt szétosztjuk a Shareholderek között.*/}
                                    <br />
                                    We also guarantee that the bought real estates payback time will be 12-14 years
                                    {/*Garantáljuk hogy a megvásárolt ingatlan bruttó megtérülési ideje 12-15 év lesz.*/}
                                    <br /><br />

                                    <h3>
                                        Immediate purchase of a sharehold
                                        {/*Azonnali Sharehold vásárlás*/}
                                    </h3>
                                    The minimum purchase is 120 000 HUF
                                    {/*Minimum befizetés: 120 000 HUF*/}
                                    <br />
                                    If the service is available on the site, you can purchase a sharehold that already produces income.
                                    {/*Amennyiben elérhető a szolgáltatás az oldalon megvehetsz azonnal olyan Shareholdot ami már pénzt*/}
                                    {/*hoz.*/}
                                </div>
                            </div>
                            <br />

                            <div className="panel panel-default">
                                <div className="panel-heading"><h2>
                                How can you withdraw your money?
                                    {/*Hogyan vehetem ki a pénzem?*/}
                                </h2></div>
                                <div className="panel-body">
                                    <h3>Payment of monthly income
                                        {/*Havi bevétel kifizetése*/}
                                    </h3>
                                    It is possibly to recieve payments monthly to your bank or paypal account.
                                    {/*Kifizetése lehetséges akár havonta bankszámlára vagy paypal fiókra.*/}

                                    <h3>Possible scenarios for selling your sharehold
                                        {/*Sharehold eladás lehetséges forgatókönyvei*/}
                                    </h3>
                                    <b>1. Selling on the website
                                        {/*1. Eladás az oldalon*/}
                                    </b><br />
                                    On the site in the immediate sharehold selling section witha price of +20%
                                    {/*Az oldalon az azonnali Sharehold eladás szekcióban +20%-os áron*/}
                                    <br /><br />

                                    <b>2. Accepting an offer from the Investify team
                                        {/*2. Investify teamjétől kapott árajánlat elfogadása*/}
                                    </b><br />
                                    It is possible that we are investing as well. In this case we will send you an offer and you can
                                    decide on accepting it or not. In case you accept we will immediately transfer the amount to your
                                    bank or paypal account.
                                    {/*Előfordulhat, hogy mi is épp tőkét invesztálunk. Ekkor kap tőlünk egy árajánlatot amit ön dönthet,*/}
                                    {/*hogy elfogad vagy sem. Elfogadása esetén azonnal jóváírjuk az összeget a bankszámláján vagy*/}
                                    {/*a paypal fiókján.*/}
                                    <br /><br />

                                    <b>3. In case of 100 shareholders who would like to sell
                                        {/*3. Ha összegyűlt 100 Shareholder aki szeretne eladni*/}
                                    </b><br />
                                    In case the number of shareholders who would like to sell their sharehold reaches 100 we can regroup
                                    the shareholds for selling a real estate. In this scenario the amount will be divided among the shareholders.
                                    {/*Ha 100 Shareholderünk is szeretne eladni átcsoportosítjuk a Shareholdokat úgy hogy a valóságban is*/}
                                    {/*el tudjunk adni egy ingatlant. Ekkor az adásvétel végén az összegét szétosztjuk a Shareholderek között*/}
                                    {/*a nekik megfelelő arányban.*/}
                                </div>
                            </div>
                            <br />

                            {/*<div className="panel panel-default">*/}
                                {/*<div className="panel-heading"><h2>Mik a Sharehold átcsoportosítás szabályai?</h2></div>*/}
                                {/*<div className="panel-body">*/}
                                    {/*Sharehold átcsoportosításra nagyobb Sharehold eladás esetén kerülhet sor. Minden ingatlanhoz*/}
                                    {/*tartozik egy albérlő megbízhatósági és egy havi hozam mutató. Garantáljuk hogy átcsoportosítást*/}
                                    {/*csak úgy hajtunk végre az ön Shareholdján hogy ezek a mutatók egyenlőek vagy jobbak legyenek.*/}
                                {/*</div>*/}
                            {/*</div>*/}
                            <br />

                            {/*<div className="panel panel-default">*/}
                                {/*<div className="panel-heading"><h2>Mire tudunk és mire nem tudunk garanciát vállalni?</h2></div>*/}
                                {/*<div className="panel-body">*/}
                                    {/*<b>Amit garantálunk:</b><br />*/}
                                    {/*- A befizetésétől számított fél éven belül tulajdonba veszünk egy ingatlan és kiadásra alkalmas*/}
                                    {/*állapotba hozzuk.<br />*/}
                                    {/*- Amennyiben szeretné eladni Shareholdját az Azonnali vásárlás szekciót használva minimum +15%*/}
                                    {/*százalékos áron hirdetjük meg.<br />*/}
                                    {/*- A munkánkat maximális szakértelemmel és odaadással végezzük<br /><br />*/}

                                    {/*<b>Nem tudunk garanciát adni:</b><br />*/}
                                    {/*- A bérlőkből adódó károk kompenzálására<br />*/}
                                    {/*De minden emberi és jogi tudásunkkal azon vagyunk hogy elkerüljük az ilyen helyzeteket, valamint*/}
                                    {/*ha már bekövetkeztek a legnagyobb szakértelemmel kezeljük.<br />*/}
                                    {/*- Az ingatlanpiac árváltozásaiból következő károkat<br />*/}
                                    {/*Bár jelenleg a trend nem erre mutat! :)<br />*/}
                                    {/*- A kiadást követő amortizációból adódó javítások összegére*/}
                                {/*</div>*/}
                            {/*</div>*/}
                            <br />
                        </div>
                        <div className="col-md-1">

                        </div>
                    </div>

                    <div className="row">
                        <div className="col-md-1">

                        </div>
                        <div className="col-md-10 text-center">
                            <h2> </h2>
                        </div>
                        <div className="col-md-1">

                        </div>
                    </div>
                </div>
            </div>
        );
    }
}