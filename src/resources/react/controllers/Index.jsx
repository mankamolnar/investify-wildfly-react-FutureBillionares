import React from 'react';
import {Link} from 'react-router';
import {NavBar} from '../components/NavBar';
import {MoneyPool} from '../components/MoneyPool';

// *** PAGES ***
export class Index extends React.Component {
    constructor() {
        super();
        this.state = {loggedIn:false};
        this.changeState = this.changeState.bind(this)
    }

    changeState() {
        console.log(this.state.loggedIn);
        this.setState({loggedIn:!this.state.loggedIn});
    }

    render() {
        return (
            <div>
                <NavBar loggedIn={this.state.loggedIn} changeState={this.changeState} />
                <MoneyPool loggedIn={this.state.loggedIn} changeState={this.changeState} />
            </div>
        );
    }
}