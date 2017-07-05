import React from 'react';
import ReactDOM from 'react-dom';
import { Router, Route, IndexRoute, browserHistory, Redirect } from 'react-router';
import {Index} from './controllers/Index';
import {Faq} from './controllers/Faq';
import {Registration} from "./controllers/Registration";


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
        <Route path="/faq" component={Faq} />
        <Route path="/registration" component={Registration} />
    </Router>
), document.getElementById('app'));