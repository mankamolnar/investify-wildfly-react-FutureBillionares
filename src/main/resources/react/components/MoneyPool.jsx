import React from 'react'
import {Link} from 'react-router'
import MPoolService from '../services/MPoolService';

export default class MoneyPool extends React.Component {
    constructor(props) {
        super(props);
        this.state = {id:0, payedIn:0, goal:0, investors:0, unitPrice:0};
        this.state.goal = 0;
        this.mPoolService = new MPoolService();
        this.mPoolService.getPool().then(r => this.setState(r));
    }

    render() {
        while (this.state.goal == 0) {
            return (
                <div className="loader"> </div>
            )
        }
        const progressBarStyle = {width:(this.state.payedIn / this.state.goal * 100)+"%"};
        if (this.props.loggedIn == false) {
            return (
                <div className="jumbotron text-center">
                    <h1>Current money pool</h1>
                    <div className="progress mprogress">
                        <div className="progress-bar progress-bar-striped active" aria-valuenow={this.state.payedIn / this.state.goal * 100} aria-valuemin="0" aria-valuemax="100" style={progressBarStyle}>
                        </div>
                    </div>

                    <p>
                        <br />
                            <b>{this.state.payedIn}</b><b> HUF</b> /
                            <span>{this.state.goal}</span> HUF<br /><br />

                            <b>Minimum investable:</b> <span>{this.state.unitPrice}</span> HUF<br />
                            <b>Guaranteed payback time:</b> 12-15 years<br />
                            <b>Predicted monthly turnover:</b> ~500 HUF<br />
                            <b>Invested already:</b> <span>{this.state.investors}</span><br />
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
                        <div className="progress-bar progress-bar-striped active" aria-valuenow={this.state.payedIn / this.state.goal * 100} aria-valuemin="0" aria-valuemax="100" style={progressBarStyle}>
                        </div>
                    </div>

                    <p>
                        <br />
                        <b>{this.state.payedIn}</b><b> HUF</b> /
                        <span>{this.state.goal}</span> HUF<br /><br />

                        <b>Minimum investable: {this.state.payedIn / this.state.goal * 100}</b> <span>{this.state.unitPrice}</span> HUF<br />
                        <b>Guaranteed payback time:</b> 12-15 years<br />
                        <b>Predicted monthly turnover:</b> ~500 HUF<br />
                        <b>Invested already:</b> <span>{this.state.investors}</span><br />
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

        }

    }
}
