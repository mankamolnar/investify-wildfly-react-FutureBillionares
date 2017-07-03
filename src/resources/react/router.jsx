import React from 'react';
import ReactDOM from 'react-dom';
import { Router, Route, IndexRoute, browserHistory, Redirect } from 'react-router';
import {Index} from './controllers/Index';


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