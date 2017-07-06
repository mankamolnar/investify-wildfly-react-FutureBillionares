import React from 'react'
import {Link} from 'react-router'

export default class NavBar extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        if (this.props.loggedIn == false) {
            return (
                <nav className="navbar navbar-default upNavbar">
                    <div className="navbar-header">
                        <Link className="navbar-brand" to="/">Investify</Link>
                    </div>
                    <div className="nav navbar-nav navbar-left">
                        <ul className="nav navbar-nav">
                            <li><Link to="/">Home page</Link></li>
                            <li><Link to="/faq">F.A.Q.</Link></li>
                        </ul>
                    </div>
                    <div className="mnavbar-right">
                        <Link className="btn btn-info" to="/registration">Registration</Link>{" "}
                        <Link className="btn btn-success" to="/login">Login</Link>
                    </div>
                </nav>
            );

        } else {
            return (
                <nav className="navbar navbar-default upNavbar">
                    <div className="navbar-header">
                        <Link className="navbar-brand" to="/">Investify</Link>
                    </div>
                    <div className="nav navbar-nav navbar-left">
                        <ul className="nav navbar-nav">
                            <li><a href="/">Dashboard</a></li>
                            <li><a href="/investments">Investments</a></li>
                            <li><a href="/shareholds">Shareholdjaid</a></li>
                            <li><a href="/market">Market</a></li>
                            <li><a href="/collections">Money pools</a></li>
                        </ul>
                    </div>
                    <div className="mnavbar-right">
                        <Link className="btn btn-success" to="/payin">Pay in</Link>{" "}
                        <Link className="btn btn-danger" to="/logout">Log out</Link>
                    </div>
                </nav>
            );

        }

    }
}
