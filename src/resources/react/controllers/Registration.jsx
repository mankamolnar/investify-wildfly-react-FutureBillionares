import React from 'react';
import {Link} from 'react-router';
import NavBar from '../components/NavBar';
import RegistrationForm from '../components/RegistrationForm';
import RegistrationService from '../services/RegistrationService';

// *** PAGES ***
export default class Registration extends React.Component {
    constructor() {
        super();
        this.state = {loggedIn: false};
        this.registrate = this.registrate.bind(this);
        this.changeState = this.changeState.bind(this);
    }

    registrate() {
        let username = document.getElementById("username");
        let password = document.getElementById("password");
        let password2 = document.getElementById("password2");
        let email = document.getElementById("email");
        this.registrationService = new RegistrationService();
        this.registrationService.registrate(username, password, password2, email);
        console.log(username.value, password.value, password2.value, email.value);
    }

    changeState() {
        console.log(this.state.loggedIn);
        this.setState({loggedIn: !this.state.loggedIn});
    }

    render() {
        return (
            <div>
                <NavBar loggedIn={this.state.loggedIn} changeState={this.changeState}/>
                <RegistrationForm registrate={this.registrate}/>
            </div>
        );
    }
}