import React from 'react';
import {Link} from 'react-router';
import NavBar from '../components/NavBar';
import RegistrationForm from '../components/RegistrationForm';
import RegistrationService from '../services/RegistrationService';

// *** PAGES ***
export default class Registration extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            loggedIn: this.props.loggedIn,
            registered: false,
            usernameOK: true,
            emailOK: true
        };
        this.registrate = this.registrate.bind(this);
    }

    registrate(username, password, password2, email) {

        this.setState({registered: true});
        this.registrationService = new RegistrationService();
        this.registrationService.registrate(username, password, password2, email).then(r => this.setState(r));
        console.log(username.value, password.value, password2.value, email.value);
    }

    render() {
        var content;
        // console.log(this.state.registered);
        if (!this.state.registered) {
            content = <RegistrationForm regState={this.state} registrate={this.registrate}/>
        } else {
            content = (<div className="alert alert-success">
                <strong>Your registration was successful!</strong></div>)
        }

        return (
            <div>
                <NavBar loggedIn={this.state.loggedIn} />
                {content}
            </div>
        );
    }
}