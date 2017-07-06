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

    handleSubmit(event) {
        alert('A name was submitted: ' + this.state.value);
        event.preventDefault();
    }

    changeState() {
        console.log(this.state.loggedIn);
        this.setState({loggedIn: !this.state.loggedIn});
    }

    render() {
        console.log("ITT");
        return (
            <div>
                <NavBar loggedIn={this.state.loggedIn} changeState={this.changeState}/>
                <RegistrationForm value={this.state.value} handleSubmit={this.handleSubmit} handleChange={this.handleChange}/>
            </div>
        );
    }
}