import React from 'react'
import {Link} from 'react-router'

export default class MoneyPool extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        const progressBarStyle = {width:'97%'};
        if (this.props.loggedIn == false) {
            return (
                <div className="jumbotron text-center">
                    <h1>Current money pool</h1>
                    <div className="progress mprogress">
                        <div className="progress-bar progress-bar-striped active" aria-valuenow="43" aria-valuemin="0" aria-valuemax="100" style={progressBarStyle}>
                        </div>
                    </div>

                    <p>
                        <br />
                            <b>9 700 000 </b><b> HUF</b> /
                            <span>10 000 000 </span> HUF<br /><br />

                            <b>Minimum investable:</b> <span>100 000 </span> HUF<br />
                            <b>Guaranteed payback time:</b> 12-15 years<br />
                            <b>Predicted monthly turnover:</b> ~500 HUF<br />
                            <b>Invested already:</b> <span>47</span><br />
                    </p>

                    <form method="post" action="/collections/payin/1">
                        <div className="td-3"></div>
                        <div className="td-3 c">

                            <a className="btn btn-info" href="/faq">F.A.Q.</a>{" "}
                            <a className="btn btn-success" href="/registration">I want to invest!</a>

                        </div>
                        <div className="td-3"></div>
                    </form>
                </div>
            );

        } else {
            return (
                <div className="jumbotron text-center">
                    <h1>Current money pool</h1>
                    <div className="progress mprogress">
                        <div className="progress-bar progress-bar-striped active" aria-valuenow="43" aria-valuemin="0" aria-valuemax="100" style={progressBarStyle}>
                        </div>
                    </div>

                    <p>
                        <br />
                        <b>9 700 000 </b><b> HUF</b> /
                        <span>10 000 000 </span> HUF<br /><br />

                        <b>Minimum investable:</b> <span>100 000 </span> HUF<br />
                        <b>Guaranteed payback time:</b> 12-15 years<br />
                        <b>Várható havi bruttó hozam:</b> ~500 HUF<br />
                        <b>Invested already:</b> <span>47</span><br />
                    </p>

                    <form method="post" action="/collections/payin/1">
                        <div className="td-4"></div>
                        <div className="td-4 c">

                            <a className="btn btn-info" href="/faq">F.A.Q.</a>{" "}
                            <a className="btn btn-success" href="/registration">I want to invest!</a>

                        </div>
                        <div className="td-4"></div>
                    </form>
                </div>
            );

        }

    }
}
