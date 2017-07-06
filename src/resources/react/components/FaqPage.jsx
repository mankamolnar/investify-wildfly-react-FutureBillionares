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
                                <div className="panel-heading"><h2>Mivel is foglalkozik ez az oldal?</h2></div>
                                <div className="panel-body"><h3>Rendszerünk egy sharing economyra épülő ingatlan befektetése portál.</h3></div>
                            </div>
                            <br />

                            <div className="panel panel-default">
                                <div className="panel-heading"><h2>Milyen módokon kereshetsz pénzt az oldalunkon?</h2></div>
                                <div className="panel-body">
                                    <h3> Shareholdot veszel az épp aktuális gyűjtésen</h3>
                                    Amennyiben részesedést veszel egy ingatlanba aktiválódik a Shareholder fiókod, melyen keresztül figyelheted hol tart
                                    a gyűjtés, valamint ha már elkezdtük keresni a lehetséges ingatlanokat egy felületen véleményezheted nekünk őket.
                                    Amennyiben az ingatlan már megvásárlásra és kiadásra került, a belőle befolyó bevételt a Shareholdjuknak megfelelő
                                    százalékban szétosztjuk a Shareholderek között.

                                    <h3> Eladod a már meglévő Shareholdodat az oldalon</h3>
                                    Weboldalunkon gyűjtéses ingatlanvásárláson kívül lehetséges azonnal is Shareholdot venni az
                                    eredeti árhoz képest 20%-al drágábban! Így ha eladod a Shareholdod az eredeti árhoz képest garantáltal
                                    <b>15%-al drágábban</b> tudod ezt megtenni! (5% szolgáltatási költséget levonunk)

                                </div>
                            </div>
                            <br />

                            <div className="panel panel-default">
                                <div className="panel-heading"><h2>Hogyan fektethetsz be?</h2></div>
                                <div className="panel-body">
                                    <h3>Gyűjtésben való részvétel</h3>
                                    Minimum befizetés: 100 000 HUF<br />
                                    Vállaljuk hogy a befizetésedtől számított fél éven belül:<br />
                                    1. Sikeresen összegyűjtünk egy ingatlan megvásárlására elegendő tőkét<br />
                                    2. Tulajdonba veszünk egy ingatlant és kiadásra kész állapotba hozzuk<br />
                                    A továbbiakban pedig kiadjuk és a bevételt szétosztjuk a Shareholderek között.<br />
                                    Garantáljuk hogy a megvásárolt ingatlan bruttó megtérülési ideje 12-15 év lesz.<br /><br />

                                    <h3>Azonnali Sharehold vásárlás</h3>
                                    Minimum befizetés: 120 000 HUF<br />
                                    Amennyiben elérhető a szolgáltatás az oldalon megvehetsz azonnal olyan Shareholdot ami már pénzt
                                    hoz.
                                </div>
                            </div>
                            <br />

                            <div className="panel panel-default">
                                <div className="panel-heading"><h2>Hogyan vehetem ki a pénzem?</h2></div>
                                <div className="panel-body">
                                    <h3>Havi bevétel kifizetése</h3>
                                    Kifizetése lehetséges akár havonta bankszámlára vagy paypal fiókra.

                                    <h3>Sharehold eladás lehetséges forgatókönyvei</h3>
                                    <b>1. Eladás az oldalon</b><br />
                                    Az oldalon az azonnali Sharehold eladás szekcióban +20%-os áron<br /><br />

                                    <b>2. Investify teamjétől kapott árajánlat elfogadása</b><br />
                                    Előfordulhat, hogy mi is épp tőkét invesztálunk. Ekkor kap tőlünk egy árajánlatot amit ön dönthet,
                                    hogy elfogad vagy sem. Elfogadása esetén azonnal jóváírjuk az összeget a bankszámláján vagy
                                    a paypal fiókján.<br /><br />

                                    <b>3. Ha összegyűlt 100 Shareholder aki szeretne eladni</b><br />
                                    Ha 100 Shareholderünk is szeretne eladni átcsoportosítjuk a Shareholdokat úgy hogy a valóságban is
                                    el tudjunk adni egy ingatlant. Ekkor az adásvétel végén az összegét szétosztjuk a Shareholderek között
                                    a nekik megfelelő arányban.
                                </div>
                            </div>
                            <br />

                            <div className="panel panel-default">
                                <div className="panel-heading"><h2>Mik a Sharehold átcsoportosítás szabályai?</h2></div>
                                <div className="panel-body">
                                    Sharehold átcsoportosításra nagyobb Sharehold eladás esetén kerülhet sor. Minden ingatlanhoz
                                    tartozik egy albérlő megbízhatósági és egy havi hozam mutató. Garantáljuk hogy átcsoportosítást
                                    csak úgy hajtunk végre az ön Shareholdján hogy ezek a mutatók egyenlőek vagy jobbak legyenek.
                                </div>
                            </div>
                            <br />

                            <div className="panel panel-default">
                                <div className="panel-heading"><h2>Mire tudunk és mire nem tudunk garanciát vállalni?</h2></div>
                                <div className="panel-body">
                                    <b>Amit garantálunk:</b><br />
                                    - A befizetésétől számított fél éven belül tulajdonba veszünk egy ingatlan és kiadásra alkalmas
                                    állapotba hozzuk.<br />
                                    - Amennyiben szeretné eladni Shareholdját az Azonnali vásárlás szekciót használva minimum +15%
                                    százalékos áron hirdetjük meg.<br />
                                    - A munkánkat maximális szakértelemmel és odaadással végezzük<br /><br />

                                    <b>Nem tudunk garanciát adni:</b><br />
                                    - A bérlőkből adódó károk kompenzálására<br />
                                    De minden emberi és jogi tudásunkkal azon vagyunk hogy elkerüljük az ilyen helyzeteket, valamint
                                    ha már bekövetkeztek a legnagyobb szakértelemmel kezeljük.<br />
                                    - Az ingatlanpiac árváltozásaiból következő károkat<br />
                                    Bár jelenleg a trend nem erre mutat! :)<br />
                                    - A kiadást követő amortizációból adódó javítások összegére
                                </div>
                            </div>
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