import React from 'react';
import {Link} from 'react-router';
import {NavBar} from '../components/NavBar';
import LoginForm from '../components/LoginForm';
import AuthService from '../services/AuthService';

export default class Login extends React.Component {
    constructor(props) {
        super(props);
        this.state = {loggedIn:this.props.loggedIn};
        this.login = this.login.bind(this)
    }

    login() {
        let user = document.getElementById("user");
        let password = document.getElementById("password");

        this.authService = new AuthService();
        this.authService.authenticate(user, password).then(r => this.props.mainControllerSetState(r));
    }

    render() {
        console.log("ittvok");
        console.log(this.props.loggedIn);

        return (
            <div>
                <NavBar loggedIn={this.props.loggedIn} />
                <LoginForm loggedIn={this.props.loggedIn} login={this.login} />
            </div>
        );
    }
}