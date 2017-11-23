/*
 * $Id: SolutionValidator.java 442 2008-01-23 14:53:36Z roman.klaehne $
 *
 * Copyright (c) 2005-2006 by Konrad-Zuse-Zentrum fuer Informationstechnik Berlin. 
 * (http://www.zib.de)  
 * 
 * Licensed under the ZIB ACADEMIC LICENSE; you may not use this file except 
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.zib.de/Optimization/Software/ziblicense.html
 *
 * as well as in the file LICENSE.txt, contained in the SNDlib distribution 
 * package.
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sndlib.core.validation;

import sndlib.core.problem.SolvedProblem;

import com.atesio.utils.message.Messages;

/**
 * This interface provides the facility to validate a given 
 * {@link sndlib.core.solution.Solution} (respectively a 
 * {@link sndlib.core.problem.SolvedProblem}) against any feasibility 
 * condition.
 * 
 * @see SolutionValidators
 * 
 * @author Roman Klaehne
 */
public interface SolutionValidator {

    /**
     * Validates the given solved problem against a specific feasibility 
     * condition.
     * <br/><br/>
     * The occuring validation errors will be appended to the specified 
     * messages container.
     * 
     * @param solvedProblem the solved problem to validate
     * @param errors the message container into those the errors are put
     */
    public void validate(SolvedProblem solvedProblem, Messages errors);
}

