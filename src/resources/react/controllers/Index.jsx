import React from 'react';
import {Link} from 'react-router';
import NavBar from '../components/NavBar';
import MoneyPool from '../components/MoneyPool';
import AuthService from '../services/AuthService';
import Registration from "./Registration";

// *** PAGES ***

export class Index extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div>
                <NavBar loggedIn={this.props.loggedIn} />
                <MoneyPool loggedIn={this.props.loggedIn} />
            </div>
        );
    }
}