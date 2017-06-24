import React from 'react'
import ReactDOM from 'react-dom'
import { Router, Route, Link, IndexRoute, hashHistory, browserHistory, Redirect } from 'react-router'

class NavBar extends React.Component {
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
                    <div className="nav navbar-nav navbar-right">
                        <button className="btn btn-info">Registration</button>
                        <button className="btn btn-success" onClick={this.props.changeState}>Login</button>
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
                    <div className="nav navbar-nav navbar-right">
                        <Link className="btn btn-success" to="/payin">Pay in</Link>
                        <button className="btn btn-danger" onClick={this.props.changeState}>Log out</button>
                    </div>
                </nav>
            );

        }

    }
}

// *** PAGES ***
class Index extends React.Component {
    constructor() {
        super();
        this.state = {loggedIn:false};
        this.changeState = this.changeState.bind(this)
    }

    changeState() {
        console.log(this.state.loggedIn);
        this.setState({loggedIn:!this.state.loggedIn});
    }

    render() {
        return (
            <NavBar loggedIn={this.state.loggedIn} changeState={this.changeState} />
        );
    }
}

var renderServer = function (comments) {
    var data = Java.from(comments);
    return React.renderToString(
        React.createElement(NavBar)
    );
};

// *** ROUTER ***
ReactDOM.render((
    <Router history={browserHistory}>
        <Route path="/" component={Index} />
        <Route path="/login" component={Index} />
        <Route path="/logout" component={Index} />
        <Route path="/faq" component={Index} />
    </Router>
), document.getElementById('app'));