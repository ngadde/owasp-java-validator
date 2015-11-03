/*
 * Copyright (c) 2015.  Steven van der Baan
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *     * Redistributions of source code must retain the above
 *       copyright notice, this list of conditions and the following
 *       disclaimer.
 *
 *     * Redistributions in binary form must reproduce the above
 *       copyright notice, this list of conditions and the following
 *       disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 *     * Neither the name of the OWASP nor the names of its
 *       contributors may be used to endorse or promote products
 *       derived from this software without specific prior written
 *       permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package org.owasp.validator.base;

import org.owasp.validator.UnsupportedContextException;
import org.owasp.validator.ValidationException;
import org.owasp.validator.Validator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Implementations of max validator against Byte, Double, Float, Integer, Long, Short, BigInteger and BigDecimal.
 *
 * @author steven
 */
public class MaxValidator extends Validator<Number> {

    private Number _max;
    private boolean _inclusive = false;

    /**
     * @param max       the maximal value to compare against
     * @param inclusive if the test inclusive of the maximal value
     */
    MaxValidator(Number max, boolean inclusive) {
        _max = max;
        _inclusive = inclusive;
    }

    /**
     * does a byte compare
     *
     * @param number
     * @throws ValidationException
     */
    public void validate(Byte number) throws ValidationException {
        if (number.compareTo((Byte) _max) == 1) throw new ValidationException("value lower than max");
        if (!_inclusive && number.compareTo((Byte) _max) == 0) throw new ValidationException("value lower than max");
    }

    /**
     * does a double compare
     *
     * @param number
     * @throws ValidationException
     */
    public void validate(Double number) throws ValidationException {
        if (number.compareTo((Double) _max) == 1) throw new ValidationException("value lower than max");
        if (!_inclusive && number.compareTo((Double) _max) == 0) throw new ValidationException("value lower than max");
    }

    /**
     * does a float compare
     *
     * @param number
     * @throws ValidationException
     */
    public void validate(Float number) throws ValidationException {
        if (number.compareTo((Float) _max) == 1) throw new ValidationException("value lower than max");
        if (!_inclusive && number.compareTo((Float) _max) == 0) throw new ValidationException("value lower than max");
    }

    /**
     * does an integer compare
     *
     * @param number
     * @throws ValidationException
     */
    public void validate(Integer number) throws ValidationException {
        if (number.compareTo((Integer) _max) == 1) throw new ValidationException("value lower than max");
        if (!_inclusive && number.compareTo((Integer) _max) == 0) throw new ValidationException("value lower than max");
    }

    /**
     * does a long compare
     *
     * @param number
     * @throws ValidationException
     */
    public void validate(Long number) throws ValidationException {
        if (number.compareTo((Long) _max) == 1) throw new ValidationException("value lower than max");
        if (!_inclusive && number.compareTo((Long) _max) == 0) throw new ValidationException("value lower than max");
    }

    /**
     * does a short compare
     *
     * @param number
     * @throws ValidationException
     */
    protected void validate(Short number) throws ValidationException {
        if (number.compareTo((Short) _max) == 1) throw new ValidationException("value lower than max");
        if (!_inclusive && number.compareTo((Short) _max) == 0) throw new ValidationException("value lower than max");
    }

    /**
     * does a BigDecimal compare
     *
     * @param number
     * @throws ValidationException
     */
    protected void validate(BigDecimal number) throws ValidationException {
        if (number.compareTo((BigDecimal) _max) == 1)
            throw new ValidationException("value lower than max");
        if (!_inclusive && number.compareTo((BigDecimal) _max) == 0)
            throw new ValidationException("value lower than max");
    }

    /**
     * does a BigInteger compare
     *
     * @param number
     * @throws ValidationException
     */
    protected void validate(BigInteger number) throws ValidationException {
        if (number.compareTo((BigInteger) _max) == 1)
            throw new ValidationException("value lower than max");
        if (!_inclusive && number.compareTo((BigInteger) _max) == 0)
            throw new ValidationException("value lower than max");
    }

    @Override
    public void validate(Number value) throws ValidationException {
        throw new UnsupportedContextException("Can't compare, unknown type ");
    }
}