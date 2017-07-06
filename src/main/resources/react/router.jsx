import React from 'react';
import ReactDOM from 'react-dom';
import { Router, Route, IndexRoute, browserHistory, Redirect } from 'react-router';
import Index from './controllers/Index';
import Faq from './controllers/Faq';
import Registration from "./controllers/Registration";
import Login from './controllers/Login'

export default class MainController extends React.Component {
    constructor(props) {
        super(props);
        this.state = {loggedIn:false, user:false};
        this.mainControllerSetState = this.mainControllerSetState.bind(this);
    }

    mainControllerSetState(newState) {
        if (!newState.loggedIn) {
            alert("Invalid username or password!");
        }
        this.setState(newState);
    }

    render() {
        const path = this.props.route.path;
        var page;

        if (path == MainController.INDEX) {
            page = <Index loggedIn={this.state.loggedIn} mainControllerSetState={this.mainControllerSetState} />;

        } else if (path == MainController.LOGIN) {
            page = <Login loggedIn={this.state.loggedIn} mainControllerSetState={this.mainControllerSetState} />;

        } else if (path == MainController.FAQ) {
            page = <Faq loggedIn={this.state.loggedIn} mainControllerSetState={this.mainControllerSetState} />;

        } else if (path == MainController.REGISTRATION) {
            page = <Registration loggedIn={this.state.loggedIn} mainControllerSetState={this.mainControllerSetState} />;

        }

        return (
            <div>
                {page}
            </div>
        );
    }

    static get INDEX() {
        return '/';
    }

    static get LOGIN() {
        return '/login';
    }

    static get FAQ() {
        return '/faq';
    }

    static get REGISTRATION() {
        return '/registration';
    }
}

// *** ROUTER ***
ReactDOM.render((
    <Router history={browserHistory}>
        <Route path="/" component={MainController} />
        <Route path="/login" component={MainController} />
        <Route path="/logout" component={MainController} />
        <Route path="/faq" component={MainController} />
        <Route path="/registration" component={MainController} />
    </Router>
), document.getElementById('app'));

