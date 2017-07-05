import React from 'react';
import {Link} from 'react-router';
import {NavBar} from '../components/NavBar';
import {MoneyPool} from '../components/MoneyPool';
import AuthService from '../services/AuthService';
import MPoolServie from '../services/MPoolService';

// *** PAGES ***
export class Index extends React.Component {
    constructor() {
        super();
        this.state = {loggedIn:false};
        this.login = this.login.bind(this)
    }

    login() {
        console.log("itt");
        this.authService = new AuthService();
        this.authService.authenticate("hihi", "haha").then(r => this.setState(r));
        console.log(this.state)
        console.log(this.state.loggedIn);
        // this.setState({loggedIn:!this.state.loggedIn});

    }

    render() {
        return (
            <div>
                <NavBar loggedIn={this.state.loggedIn} login={this.login} />
                <MoneyPool loggedIn={this.state.loggedIn} login={this.login} />
            </div>
        );
    }
}