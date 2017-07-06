import React from 'react';
import {Link} from 'react-router';
// *** PAGES ***
export default class RegistrationForm extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (

            <div className="jumbotron text-center">
                <h1>Registration</h1>
                    <div className="td-2 title">
                        Username
                    </div>
                    <div className="td-2">
                        <input type="text" id="username" name="username" className="form-control half"/>
                    </div>

                    <div className="td-2 title newline">
                        Password
                    </div>
                    <div className="td-2">
                        <input type="password" name="password" id="password" className="form-control half"/>
                    </div>

                    <div className="td-2 title newline">
                        Confirm Password
                    </div>
                    <div className="td-2">
                        <input type="password" name="password2" id="password2" className="form-control half"/>
                    </div>

                    <div className="td-2 title">
                        E-mail
                    </div>
                    <div className="td-2">
                        <input type="email" name="email" id="email" className="form-control half"/>
                    </div>

                    <div className="td-1">
                        <button type="submit" className="btn btn-success" onClick={this.props.registrate}>Sign Up</button>
                    </div>
            </div>
        );
    }
}