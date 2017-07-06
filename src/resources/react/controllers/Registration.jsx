import React from 'react';
import {Link} from 'react-router';
import NavBar from '../components/NavBar';
import RegistrationForm from '../components/RegistrationForm';
// *** PAGES ***
export default class Registration extends React.Component {
    constructor() {
        super();
        this.state = {loggedIn: false, value: ''};

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
        this.changeState = this.changeState.bind(this);
    }

    handleChange(event) {
        this.setState({value: event.target.value});
    }

    // handleSubmit(event) {
    //     alert('A name was submitted: ' + this.state.value);
    //     event.preventDefault();
    // }

    handleSubmit(event) {
        console.log("ITT");
        let username = document.getElementById("username");
        console.log(username);
    }

    changeState() {
        console.log(this.state.loggedIn);
        this.setState({loggedIn: !this.state.loggedIn});
    }

    render() {
        return (
            <div>
                <NavBar loggedIn={this.state.loggedIn} changeState={this.changeState}/>
                <RegistrationForm value={this.state.value} handleSubmit={this.handleSubmit} handleChange={this.handleChange}/>
            </div>
        );
    }
}