import React from 'react';
import {Link} from 'react-router';
import {NavBar} from '../components/NavBar';
import LoginForm from '../components/LoginForm';
import AuthService from '../services/AuthService';

export default class Login extends React.Component {
    constructor() {
        super();
        this.state = {loggedIn:false};
        this.login = this.login.bind(this)
    }

    login() {
        this.authService = new AuthService();
        this.authService.authenticate("hihi", "haha").then(r => this.setState(r));
    }

    render() {
        return (
            <div>
                <NavBar loggedIn={this.state.loggedIn} login={this.login} />
                <LoginForm loggedIn={this.state.loggedIn} login={this.login} />
            </div>
        );
    }
}